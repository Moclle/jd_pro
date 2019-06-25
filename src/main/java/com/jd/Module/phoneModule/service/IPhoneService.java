package com.jd.Module.phoneModule.service;

import com.jd.pojo.Phone;
import org.springframework.stereotype.Service;

import java.util.List;
@Deprecated
@Service
public interface IPhoneService {

    List<Phone> getAll(int page);

}
