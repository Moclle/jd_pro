package com.jd.Module.imageModule.execption;

import com.jd.common.enums.ImageErrorEnum;

public class ImageException extends RuntimeException {

    public ImageException(String message) {
        super(ImageErrorEnum.IMAGE_ERROR.getMsg());
    }

    public ImageException() {
        super();
    }
}
