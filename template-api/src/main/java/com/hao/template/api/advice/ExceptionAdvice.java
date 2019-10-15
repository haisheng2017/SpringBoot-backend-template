package com.hao.template.api.advice;

import com.hao.template.common.exception.TemplateException;
import com.hao.template.common.response.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by hao
 * 2019/10/15
 */
@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(TemplateException.class)
    public Result<?> handleAppException(TemplateException e) {
        return Result.fail(e);
    }
}
