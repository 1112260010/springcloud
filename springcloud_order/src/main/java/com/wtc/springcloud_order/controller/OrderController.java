package com.wtc.springcloud_order.controller;

import com.wtc.springcloud_order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;



    @RequestMapping("/getOrderUsers")
    public List<String> getOrderUsers(){

        System.out.println("订单服务开始调度会员服务，调度中.....");

        return orderService.getAllUserService();

    }
}
