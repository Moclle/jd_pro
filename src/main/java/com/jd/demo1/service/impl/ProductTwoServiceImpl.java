//package com.jd.demo1Controller.service.impl;
//
//import com.jd.demo1Controller.service.IProductTwoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class ProductTwoServiceImpl implements IProductTwoService {
//
//    @Autowired
//    private ProductTwoMapper ProductTwoMapper;
//
//    @Override
//    public void add(ProductTwo ProductTwo) {
//        ProductTwoMapper.insert(ProductTwo);
//    }
//
//    @Override
//    public List<ProductTwo> getAll() {
//        return ProductTwoMapper.selectByExample(new ProductTwoExample());
//    }
//}
