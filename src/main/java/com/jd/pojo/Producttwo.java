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
public class Producttwo implements Serializable {
    private Integer producttwoid;

    private String producttwoname;

    private String producttwodescription;

    private String producttwourl;

    private Integer oneid;

    private static final long serialVersionUID = 1L;

    public Integer getProducttwoid() {
        return producttwoid;
    }

    public void setProducttwoid(Integer producttwoid) {
        this.producttwoid = producttwoid;
    }

    public String getProducttwoname() {
        return producttwoname;
    }

    public void setProducttwoname(String producttwoname) {
        this.producttwoname = producttwoname == null ? null : producttwoname.trim();
    }

    public String getProducttwodescription() {
        return producttwodescription;
    }

    public void setProducttwodescription(String producttwodescription) {
        this.producttwodescription = producttwodescription == null ? null : producttwodescription.trim();
    }

    public String getProducttwourl() {
        return producttwourl;
    }

    public void setProducttwourl(String producttwourl) {
        this.producttwourl = producttwourl == null ? null : producttwourl.trim();
    }

    public Integer getOneid() {
        return oneid;
    }

    public void setOneid(Integer oneid) {
        this.oneid = oneid;
    }
}