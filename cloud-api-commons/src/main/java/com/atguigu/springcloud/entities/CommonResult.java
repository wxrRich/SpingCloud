package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: CommonResult
 * @description:
 * @author: wang.xr
 * @create: 2020-07-21 14:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private  T     data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}