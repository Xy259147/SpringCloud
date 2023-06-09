package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liao hua
 * @date 2023/4/19 18:26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
  public static void main(String[] args) {
    SpringApplication.run(NacosConfigClientMain3377.class, args);
  }
}
