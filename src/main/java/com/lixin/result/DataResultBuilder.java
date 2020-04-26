package com.lixin.result;

import java.io.Serializable;

/**
 * @author zhenglubo
 */
public class DataResultBuilder implements Serializable {

    public static DataResult success() {
        return new DataResult().success();
    }

    public static <T> DataResult<T> success(T data) {
        return new DataResult().success(data);
    }

    public static <T> DataResult fail() {
        return new DataResult().fail();
    }

    public static <T> DataResult<T> fail(String message) {
        return new DataResult().fail(message);
    }

    public static <T> DataResult<T> fail(int status, String info, String message) {
        return new DataResult().fail(status, info, message);
    }

}
