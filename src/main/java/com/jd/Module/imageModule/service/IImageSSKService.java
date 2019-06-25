package com.jd.Module.imageModule.service;

import com.jd.pojo.ImageSSk;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IImageSSKService {

    List<ImageSSk> getSSKImage();

}
