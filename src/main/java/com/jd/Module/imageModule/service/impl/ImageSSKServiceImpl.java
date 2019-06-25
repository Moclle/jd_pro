package com.jd.Module.imageModule.service.impl;

import com.jd.Module.imageModule.service.IImageSSKService;
import com.jd.pojo.ImageSSk;
import com.jd.pojo.ImageSSkExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImageSSKServiceImpl implements IImageSSKService {

    @Autowired
    private com.jd.mapper.ImageSSkMapper ImageSSkMapper;


    @Override
    public List<ImageSSk> getSSKImage() {
        List<ImageSSk> imageSSks = ImageSSkMapper.selectByExample(new ImageSSkExample());

        return imageSSks;
    }
}
