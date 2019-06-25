package com.jd.Module.phoneModule.service;

import com.jd.VO.PhoneVo.PhoneBigAndSmallVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBigPhoneService {

    List<PhoneBigAndSmallVO> getAll(int page);

    Long getCount();

}
