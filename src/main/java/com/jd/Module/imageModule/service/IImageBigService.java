package com.jd.Module.imageModule.service;

import com.jd.pojo.ImageBig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IImageBigService {

    List<ImageBig> getHotBigImage();

}
