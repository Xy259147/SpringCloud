package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liao hua
 * @date 2023/4/6 15:23
 */
@Slf4j
@RestController
public class OrderZKController {

  public static final String INVOKE_URL = "http://cloud-provider-payment";

  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping(value = "/consumer/payment/zk")
  public String paymentInfo() {
    String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
    System.out.println("消费者调用支付服务(zookeeper)--->result:" + result);
    return result;
  }

}
