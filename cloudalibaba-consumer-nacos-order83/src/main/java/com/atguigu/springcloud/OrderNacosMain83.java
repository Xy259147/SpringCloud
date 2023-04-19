package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liao hua
 * @date 2023/4/19 16:19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83 {
  public static void main(String[] args) {
    SpringApplication.run(OrderNacosMain83.class,args);
  }
}
