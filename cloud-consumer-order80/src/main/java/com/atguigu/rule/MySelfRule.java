package com.atguigu.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MyRule
 * @description: 自定义Ribbon规则
 * @author: wang.xr
 * @create: 2020-08-06 18:10
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机

    }
}