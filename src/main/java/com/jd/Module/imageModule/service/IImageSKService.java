package com.jd.Module.imageModule.service;

import com.jd.pojo.ImageSk;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IImageSKService {

    List<ImageSk> getSKImage();

}
