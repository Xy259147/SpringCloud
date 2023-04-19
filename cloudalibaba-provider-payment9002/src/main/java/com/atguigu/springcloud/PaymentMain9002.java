package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liao hua
 * @date 2023/4/19 16:00
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain9002.class, args);
  }

}
