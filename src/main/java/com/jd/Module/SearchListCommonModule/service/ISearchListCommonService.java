package com.jd.Module.SearchListCommonModule.service;

import com.jd.VO.commonVO.commonVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISearchListCommonService<T> {
    List<commonVo<T>> getAll(int page,String mapperName);

    Long getCount(String mapperName);
}

