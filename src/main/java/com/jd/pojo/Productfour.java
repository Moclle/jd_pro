package com.jd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Productfour implements Serializable {
    private Integer productfourid;

    private String productfourname;

    private String productfourdescription;

    private String productfoururl;

    private Integer threeid;

    private static final long serialVersionUID = 1L;

    public Integer getProductfourid() {
        return productfourid;
    }

    public void setProductfourid(Integer productfourid) {
        this.productfourid = productfourid;
    }

    public String getProductfourname() {
        return productfourname;
    }

    public void setProductfourname(String productfourname) {
        this.productfourname = productfourname == null ? null : productfourname.trim();
    }

    public String getProductfourdescription() {
        return productfourdescription;
    }

    public void setProductfourdescription(String productfourdescription) {
        this.productfourdescription = productfourdescription == null ? null : productfourdescription.trim();
    }

    public String getProductfoururl() {
        return productfoururl;
    }

    public void setProductfoururl(String productfoururl) {
        this.productfoururl = productfoururl == null ? null : productfoururl.trim();
    }

    public Integer getThreeid() {
        return threeid;
    }

    public void setThreeid(Integer threeid) {
        this.threeid = threeid;
    }
}