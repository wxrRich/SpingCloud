package com.atguigu.springcloud;

import com.atguigu.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//当调用 CLOUD-PAYMENT-SERVICE 时候使用的 规则
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE" ,configuration = MySelfRule.class )
public class orderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(orderMain80.class,args);
    }
}
