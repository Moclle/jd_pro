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
public class Productone implements Serializable {
    private Integer productoneid;

    private String productonename;

    private String productonedescirption;

    private String productoneurl;

    private static final long serialVersionUID = 1L;

    public Integer getProductoneid() {
        return productoneid;
    }

    public void setProductoneid(Integer productoneid) {
        this.productoneid = productoneid;
    }

    public String getProductonename() {
        return productonename;
    }

    public void setProductonename(String productonename) {
        this.productonename = productonename == null ? null : productonename.trim();
    }

    public String getProductonedescirption() {
        return productonedescirption;
    }

    public void setProductonedescirption(String productonedescirption) {
        this.productonedescirption = productonedescirption == null ? null : productonedescirption.trim();
    }

    public String getProductoneurl() {
        return productoneurl;
    }

    public void setProductoneurl(String productoneurl) {
        this.productoneurl = productoneurl == null ? null : productoneurl.trim();
    }
}