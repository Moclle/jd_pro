package com.jd.Module.productModule.controller.productController;

import com.jd.VO.ProductOne2ThreeAndFourVO;
import com.jd.VO.ProductOne2TwoVO;
import com.jd.common.result.Result;
import com.jd.Module.productModule.service.IProductOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test1")
public class Test1Controller {

    private IProductOneService IProductOneService1;

    @Autowired
    Test1Controller(IProductOneService IProductOneService2) {
        this.IProductOneService1 = IProductOneService2;
    }

    @PostMapping("/getOne2TwoMap")
    public Result getOne2TwoMap() {
        List<ProductOne2TwoVO> one2TwoVOS = IProductOneService1.myGetOne2TwoList();
        return Result.success(one2TwoVOS);
    }

    @RequestMapping("/getAll")
    public Result myGetOne2ThreeAndFourList() {
        List<ProductOne2ThreeAndFourVO> threeAndFourVOS = IProductOneService1.myGetOne2ThreeAndFourList();
        return Result.success(threeAndFourVOS);
    }



}
