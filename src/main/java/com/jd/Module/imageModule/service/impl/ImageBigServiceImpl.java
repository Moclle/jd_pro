package com.jd.Module.imageModule.service.impl;

import com.jd.Module.imageModule.service.IImageBigService;
import com.jd.mapper.ImageBigMapper;
import com.jd.pojo.ImageBig;
import com.jd.pojo.ImageBigExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImageBigServiceImpl implements IImageBigService {

    @Autowired
    private ImageBigMapper ImageBigMapper;

    @Override
    public List<ImageBig> getHotBigImage() {
        ImageBigExample example = new ImageBigExample();
        Long l = ImageBigMapper.countByExample(example);
        int i = l.intValue();
        int num;
        int size = 8;
        for (; ; ) {
            int i1 = (int) (Math.random() * i);
            if (i1 + 8 < i) {
                num = i1;
                break;
            }
        }
        example.setLeftLimit(num);
        example.setLimitSize(size);
        List<ImageBig> imageBigs = ImageBigMapper.selectByExample(example);
        return imageBigs;
    }
}
