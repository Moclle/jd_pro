package com.jd.Module.imageModule.controller.imageBigController;


import com.google.common.collect.Lists;
import com.jd.Module.imageModule.service.IImageEnjoyService;
import com.jd.common.result.Result;
import com.jd.pojo.ImageEnjoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getEnjoyImage")
public class ImageEnjoyGetController {

    private IImageEnjoyService service;

    @Autowired
    public ImageEnjoyGetController(IImageEnjoyService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public Result getEnjoyImage(){
        List<ImageEnjoy> enjoyImages = service.getEnjoyImages();
        List<List<ImageEnjoy>> partition = Lists.partition(enjoyImages, 10);
        return Result.success(partition);
    }

}
