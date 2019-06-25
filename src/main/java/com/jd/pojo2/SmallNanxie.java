package com.jd.pojo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SmallNanxie implements Serializable {
    private String sku;

    private String title;

    private String imageUrl;

    private String bSku;

    private String stock;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getbSku() {
        return bSku;
    }

    public void setbSku(String bSku) {
        this.bSku = bSku == null ? null : bSku.trim();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}