package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author liao hua
 * @date 2023/4/7 17:31
 */
@Slf4j
@RestController
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @RequestMapping(value = "/payment/zk")
  public String paymentzk() {
    return "springcloud with zookeeper: " + serverPort + "\t"+ UUID.randomUUID().toString();
  }
}
