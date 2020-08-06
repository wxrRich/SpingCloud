package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;

/**
 * @className: orderController
 * @description:
 * @author: wang.xr
 * @create: 2020-07-23 14:08
 **/
@RestController
@Slf4j
public class OrderController {
    // 单机模式的调用
//    public static final String PAYMENT_URL="http://localhost:8001";
    //服务端为集群模式的调用 直接调用名称
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payemnt/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){

        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/" + id,CommonResult.class);
    }
}