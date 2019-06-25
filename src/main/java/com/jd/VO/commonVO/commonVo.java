package com.jd.VO.commonVO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class commonVo<T> {
    private String b_sku;

    private String title;

    private String titleAlt;

    private BigDecimal price;

    private String stock;

    private String imageUrl;

    private String pid;

    private String comment;

    private String shopMessage;

    private String icons;

    private Date created;

    private Date updated;


    private ArrayList shopList;
    private List<T> smallImageList;


}
