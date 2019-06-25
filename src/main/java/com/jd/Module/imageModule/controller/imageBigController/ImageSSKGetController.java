package com.jd.Module.imageModule.controller.imageBigController;

import com.jd.Module.imageModule.service.IImageSSKService;
import com.jd.common.result.Result;
import com.jd.pojo.ImageSSk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getSSKImage")
public class ImageSSKGetController {

    private IImageSSKService service;

    @Autowired
    public ImageSSKGetController(IImageSSKService IImageSSKService) {
        this.service = IImageSSKService;
    }

    @GetMapping("/get")
    public Result getSKImage(){
        List<ImageSSk> sskImage = service.getSSKImage();
//        List<List<ImageSSk>> lists = ListUtil.averageAssign(sskImage, 2);
        return Result.success(sskImage);
    }

}
