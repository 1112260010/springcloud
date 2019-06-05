package com.wtc.springcloud_order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;

    public List<String> getAllUserService(){

        return restTemplate.getForObject("http://service-member/getAllUsers",List.class);

    }
}
