package com.jd.Module.productModule.service.impl;

import com.jd.VO.ProductOne2ThreeAndFourVO;
import com.jd.VO.ProductOne2TwoVO;
import com.jd.mapper.ProductoneMapper;
import com.jd.Module.productModule.service.IProductOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductOneServiceImpl implements IProductOneService {

    @Autowired
    private ProductoneMapper mapper;

    @Override
    public List<ProductOne2TwoVO> myGetOne2TwoList() {
        return mapper.myGetOne2TwoList();
    }

    @Override
    public List<ProductOne2ThreeAndFourVO> myGetOne2ThreeAndFourList() {
        return mapper.myGetOne2ThreeAndFourList();
    }
}
