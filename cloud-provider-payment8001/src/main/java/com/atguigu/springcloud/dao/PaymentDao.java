package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 支付服务持久层接口定义
 * @Author liao hua
 * @Date 2023-04-05 21:12
 */
@Mapper
public interface PaymentDao {
    /**
     * 创建支付流水信息
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询流水号
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
