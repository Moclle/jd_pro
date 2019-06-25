package com.jd.common.enums;

public enum ProductErrorEnum {
    ONE2TWO_QUERY_ERROR("1000","1——2级列表查询错误");

    private String code;
    private String msg;

    ProductErrorEnum(String code, String msg) {
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
