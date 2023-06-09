package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付服务模块
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 开起服务发现
public class PaymentMain8001 {
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}

