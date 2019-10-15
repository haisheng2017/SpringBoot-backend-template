package com.hao.template.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by hao
 * 2019/10/12
 */

@AllArgsConstructor
@Getter
public enum ErrorCode {
    SUCCESS(0, "success"),
    FAILED(1, "failed" );

    private int code;
    private String msg;
}
