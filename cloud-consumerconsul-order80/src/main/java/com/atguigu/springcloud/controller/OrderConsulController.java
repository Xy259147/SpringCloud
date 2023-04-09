package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liao hua
 * @date 2023-04-09 22:32
 **/
@RestController
public class OrderConsulController {
    public static final String INVOKE_URL = "http://consul-provider-payment"; //consul-provider-payment

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        String url = "http://testConsul/payment/consul";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("消费者调用支付服务(consule)--->result:" + result);
        return result;
    }
}
