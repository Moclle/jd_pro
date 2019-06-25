package com.jd.Module.imageModule.service.impl;

import com.jd.Module.imageModule.service.IImageEnjoyService;
import com.jd.mapper.ImageEnjoyMapper;
import com.jd.pojo.ImageEnjoy;
import com.jd.pojo.ImageEnjoyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImageEnjoyServiceImpl implements IImageEnjoyService {

    @Autowired
    private ImageEnjoyMapper ImageEnjoyMapper;

    @Override
    public List<ImageEnjoy> getEnjoyImages() {
        List<ImageEnjoy> imageEnjoys = ImageEnjoyMapper.selectByExample(new ImageEnjoyExample());
        return imageEnjoys;
    }
}
