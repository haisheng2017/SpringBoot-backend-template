package com.hao.template.common.exception;

import com.hao.template.common.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by hao
 * 2019/10/14
 */
@AllArgsConstructor
@Getter
public class TemplateException extends RuntimeException {
    private ErrorCode errorCode;
}
