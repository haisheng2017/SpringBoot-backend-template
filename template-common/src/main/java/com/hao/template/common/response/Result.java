package com.hao.template.common.response;

import com.hao.template.common.enums.ErrorCode;
import com.hao.template.common.exception.TemplateException;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by hao
 * 2019/10/12
 */
@Getter
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    private Result(ErrorCode code, T data) {
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.data = data;
    }

    private Result(TemplateException e) {
        this.code = e.getErrorCode().getCode();
        this.msg = e.getErrorCode().getMsg();
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ErrorCode.SUCCESS, data);
    }

    public static <T> Result<T> fail(TemplateException e) {
        return new Result<>(e);
    }
}
