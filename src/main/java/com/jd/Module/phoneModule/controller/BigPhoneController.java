package com.jd.Module.phoneModule.controller;


import com.jd.Module.phoneModule.service.IBigPhoneService;
import com.jd.VO.PhoneVo.PhoneBigAndSmallVO;
import com.jd.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bigPhoneAndSmall")
public class BigPhoneController {

    private IBigPhoneService service;

    @Autowired
    public BigPhoneController(IBigPhoneService service) {
        this.service = service;
    }

    @GetMapping("/get/{page}")
    public Result getBigPhoneAndSmall(@PathVariable(name = "page") Integer page) {
        List<PhoneBigAndSmallVO> all = service.getAll(page);
        return Result.success(all);
    }

    @GetMapping("/getCount")
    public Result getCount() {
        return Result.success(service.getCount());
    }


}
