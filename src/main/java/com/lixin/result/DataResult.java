package com.lixin.result;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhenglubo
 */
@Data
public class DataResult<T> implements Serializable {

    private int status;
    private String info;
    private String message;
    private T data;

    public DataResult<T> success() {

        this.status = 0;
        this.info = "ok";
        this.message = "ok";
        return this;
    }

    public DataResult<T> success(T data) {
        this.status = 0;
        this.info = "ok";
        this.message = "ok";
        this.data = data;
        return this;
    }

    public DataResult<T> fail() {
        this.status = 1;
        this.info = "fail";
        this.message = "fail";
        return this;
    }

    public DataResult<T> fail(String message) {
        this.status = 1;
        this.info = "fail";
        this.message = message;
        return this;
    }

    public DataResult<T> fail(int status, String info, String message) {
        this.status = status;
        this.info = info;
        this.message = message;
        return this;
    }
}
