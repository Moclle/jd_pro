package com.jd.common.enums;

public enum ImageErrorEnum {
    IMAGE_ERROR("2000","图片异常");

    private String code;
    private String msg;

    ImageErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
