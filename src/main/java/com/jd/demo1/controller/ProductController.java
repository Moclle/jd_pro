//package com.jd.demo1Controller.controller;
//
//import com.jd.common.result.Result;
//import com.jd.demo1Controller.service.IProductOneService;
//import com.jd.demo1Controller.service.IProductThreeService;
//import com.jd.demo1Controller.service.IProductTwoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    @Autowired
//    private IProductOneService IProductOneService;
//
//    @Autowired
//    private IProductTwoService IProductTwoService;
//
//    @Autowired
//    private IProductThreeService IProductThreeService;
//
//    @PostMapping("/add")
//    public String add(ProductOne ProductOne, ProductTwo ProductTwo, ProductThree ProductThree){
//        try {
//            IProductOneService.add(Optional.ofNullable(ProductOne).get());
//            IProductTwoService.add(Optional.ofNullable(ProductTwo).get());
//            IProductThreeService.add(Optional.ofNullable(ProductThree).get());
//        } catch (Exception e) {
//            return "吔屎";
//        }
//        return "成功";
//    }
//
//    @PostMapping("/test")
//    public Result getAll(){
//        List<ProductTwo> productTwoList = IProductTwoService.getAll();
//        return Result.success(productTwoList);
//    }
//}
