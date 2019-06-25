//package com.jd.index.service.impl;
//
//import com.jd.index.service.IProductOneSelectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductOneSelectServiceImpl implements IProductOneSelectService {
//
//
//    @Autowired
//    private com.jd.mapper.ProductOneMapper ProductOneMapper;
//
//    @Override
//    public List<ProductOne> getAll() {
//        ProductOneExample example = new ProductOneExample();
//        ProductOneExample.Criteria criteria = example.createCriteria();
//        List<ProductOne> productOnes = ProductOneMapper.selectByExample(example);
//        return productOnes;
//    }
//}
