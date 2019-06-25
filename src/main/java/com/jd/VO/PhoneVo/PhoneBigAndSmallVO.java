package com.jd.VO.PhoneVo;

import com.jd.pojo.BigPhone;
import com.jd.pojo.SmallPhone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PhoneBigAndSmallVO extends BigPhone {
    private String b_sku;

    private ArrayList shopList;
    private List<SmallPhone> smallPhoneList;

}
