package com.jd.Module.productModule.exception;

import com.jd.common.enums.ProductErrorEnum;

public class ProductException extends RuntimeException {

    public ProductException(String message) {
        super(ProductErrorEnum.ONE2TWO_QUERY_ERROR.getMsg());
    }

    public ProductException() {
        super();
    }
}
