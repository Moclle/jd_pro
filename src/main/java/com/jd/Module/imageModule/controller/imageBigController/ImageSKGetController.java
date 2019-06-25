package com.jd.Module.imageModule.controller.imageBigController;


import com.jd.Module.imageModule.service.IImageSKService;
import com.jd.common.result.Result;
import com.jd.pojo.ImageSk;
import com.jd.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getSKImage")
public class ImageSKGetController {

    private IImageSKService service;

    @Autowired
    public ImageSKGetController(IImageSKService IImageSKService) {
        this.service = IImageSKService;
    }
    @GetMapping("/get")
    public Result getSKImage(){
        List<ImageSk> skImage = service.getSKImage();
        List<List<ImageSk>> lists = ListUtil.averageAssign(skImage, 4);

        return Result.success(lists);
    }

}
