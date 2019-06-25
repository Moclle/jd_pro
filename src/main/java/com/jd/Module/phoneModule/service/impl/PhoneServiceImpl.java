package com.jd.Module.phoneModule.service.impl;

import com.jd.Module.phoneModule.service.IPhoneService;
import com.jd.mapper.PhoneMapper;
import com.jd.pojo.Phone;
import com.jd.pojo.PhoneExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Deprecated
@Service
@Transactional
public class PhoneServiceImpl implements IPhoneService {


    @Autowired
    private PhoneMapper PhoneMapper;

    @Override
    public List<Phone> getAll(int page) {
        PhoneExample phoneExample = new PhoneExample();
        phoneExample.setLeftLimit(60 * (page - 1));
        phoneExample.setLimitSize(60);
        List<Phone> phones = PhoneMapper.selectByExample(phoneExample);
        return phones;
    }
}
