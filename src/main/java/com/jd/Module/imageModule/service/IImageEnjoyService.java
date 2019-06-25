package com.jd.Module.imageModule.service;


import com.jd.pojo.ImageEnjoy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IImageEnjoyService {

    List<ImageEnjoy> getEnjoyImages();

}
