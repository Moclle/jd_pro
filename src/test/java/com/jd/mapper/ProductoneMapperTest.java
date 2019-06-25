package com.jd.mapper;

import com.jd.VO.ProductOne2TwoVO;
import com.jd.pojo.Productone;
import com.jd.pojo.ProductoneExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductoneMapperTest {

    @Autowired
    private ProductoneMapper ProductoneMapper;

    @Test
    public void hah(){
        List<Productone> productones = ProductoneMapper.selectByExample(new ProductoneExample());
        productones.stream()
                .forEach(System.out::println);
    }
    @Test
    public void One2TwoMap(){
        List<ProductOne2TwoVO> productOne2TwoVOS = ProductoneMapper.myGetOne2TwoList();
        productOne2TwoVOS.stream()
                .forEach(System.out::println);
    }
}