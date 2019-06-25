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
public class Productthree implements Serializable {
    private Integer productthreeid;

    private String productthreename;

    private String productthreedescription;

    private String productthreeurl;

    private Integer oneid;

    private static final long serialVersionUID = 1L;

    public Integer getProductthreeid() {
        return productthreeid;
    }

    public void setProductthreeid(Integer productthreeid) {
        this.productthreeid = productthreeid;
    }

    public String getProductthreename() {
        return productthreename;
    }

    public void setProductthreename(String productthreename) {
        this.productthreename = productthreename == null ? null : productthreename.trim();
    }

    public String getProductthreedescription() {
        return productthreedescription;
    }

    public void setProductthreedescription(String productthreedescription) {
        this.productthreedescription = productthreedescription == null ? null : productthreedescription.trim();
    }

    public String getProductthreeurl() {
        return productthreeurl;
    }

    public void setProductthreeurl(String productthreeurl) {
        this.productthreeurl = productthreeurl == null ? null : productthreeurl.trim();
    }

    public Integer getOneid() {
        return oneid;
    }

    public void setOneid(Integer oneid) {
        this.oneid = oneid;
    }
}