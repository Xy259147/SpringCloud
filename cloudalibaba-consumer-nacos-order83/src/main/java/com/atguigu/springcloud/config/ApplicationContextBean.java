package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liao hua
 * @date 2023/4/19 16:22
 */
@Configuration
public class ApplicationContextBean {

  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

}
