package com.cloud.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ResponseBase {

    private Integer code;

    private String msg;

    private Object data;

    public ResponseBase(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseBase() {
    }
}
