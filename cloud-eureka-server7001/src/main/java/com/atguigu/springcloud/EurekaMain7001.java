package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author liao hua
 * @date 2023/4/6 17:21
 */
@SpringBootApplication
@EnableEurekaServer // 声明服务注册中心
public class EurekaMain7001 {
  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class, args);
  }
}
