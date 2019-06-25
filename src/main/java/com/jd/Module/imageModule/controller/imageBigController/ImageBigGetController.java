package com.jd.Module.imageModule.controller.imageBigController;

import com.jd.common.result.Result;
import com.jd.Module.imageModule.service.IImageBigService;
import com.jd.pojo.ImageBig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getBigHotImage")
public class ImageBigGetController {

    private IImageBigService service;

    @Autowired
    ImageBigGetController(IImageBigService IImageBigService) {
        this.service = IImageBigService;
    }

    @GetMapping("/get")
    public Result getBigHotImage() {
        List<ImageBig> hotBigImage = service.getHotBigImage();
        return Result.success(hotBigImage);
    }
}
