package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用响应泛型类
 * @Author liao hua
 * @Date 2023-04-05 21:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 响应编码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 消息内容
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
