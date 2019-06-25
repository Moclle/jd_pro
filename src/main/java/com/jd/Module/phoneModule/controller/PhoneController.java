package com.jd.Module.phoneModule.controller;


import com.jd.Module.phoneModule.service.IPhoneService;
import com.jd.common.result.Result;
import com.jd.pojo.Phone;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TODO 报废
@Deprecated
@RestController
@RequestMapping("/phone")
public class PhoneController {

    private IPhoneService service;

    public PhoneController(IPhoneService service) {
        this.service = service;
    }

    @GetMapping("/page/{pageNum}")
    public Result pageController(@PathVariable(name = "pageNum") Integer pageNum) {
        List<Phone> all = service.getAll(pageNum);
        return Result.success(all);
    }

}
