package com.jd.Module.SearchListCommonModule.controller;

import com.jd.Module.SearchListCommonModule.service.ISearchListCommonService;
import com.jd.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/common_page_list")
public class SearchListCommonController {

    @Autowired
    private ISearchListCommonService ISearchListCommonService;

    @RequestMapping("/{phoneLevel}/{productName}/{pageNum}")
    public Result getBigPhoneAndSmall(@PathVariable(name = "phoneLevel") String phoneLevel,
                                      @PathVariable(name = "productName") String productName,
                                      @PathVariable(name = "pageNum") Integer pageNum) {
        List all1 = ISearchListCommonService.getAll(pageNum, productName);
        return Result.success(all1);
    }

    @RequestMapping("/{productName}")
    public Result getCount(@PathVariable(name = "productName") String productName) {
        return Result.success(ISearchListCommonService.getCount(productName));
    }

    @RequestMapping("/filter")
    public Result filter(@RequestBody Map<String, Object> searchMap) {
        System.out.println(searchMap);
        return Result.success("1");
    }

}
