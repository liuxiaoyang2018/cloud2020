package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.CompletableFuture;

/**
 * @Auther: admin
 * @Date: 2020/3/26 14:14
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE",fallback =  OrderServiceImpl.class)
public interface OrderService {





    @GetMapping(path = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}
