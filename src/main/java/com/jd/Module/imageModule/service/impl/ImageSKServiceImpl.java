package com.jd.Module.imageModule.service.impl;

import com.jd.Module.imageModule.service.IImageSKService;
import com.jd.mapper.ImageSkMapper;
import com.jd.pojo.ImageSk;
import com.jd.pojo.ImageSkExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImageSKServiceImpl implements IImageSKService {

    @Autowired
    private ImageSkMapper ImageSkMapper;

    @Override
    public List<ImageSk> getSKImage() {
        List<ImageSk> imageSks = ImageSkMapper.selectByExample(new ImageSkExample());
        return imageSks;
    }
}
