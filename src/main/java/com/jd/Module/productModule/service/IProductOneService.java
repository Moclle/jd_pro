package com.jd.Module.productModule.service;

import com.jd.VO.ProductOne2ThreeAndFourVO;
import com.jd.VO.ProductOne2TwoVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductOneService {

    List<ProductOne2TwoVO> myGetOne2TwoList();

    List<ProductOne2ThreeAndFourVO> myGetOne2ThreeAndFourList();
}
