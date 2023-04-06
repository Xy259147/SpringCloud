package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * 支付服务定义
 * @Author liao hua
 * @Date 2023-04-05 21:26
 */
public interface PaymentService {

    /**
     * 创建支付流水信息
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询流水号
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);
}
