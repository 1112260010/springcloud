package com.wtc.springcloud_member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

        //控制器方法，返回的都是json数据
        @RequestMapping("/getAllUsers")
        public List<String> getAllUsers(){
            List<String> list=new ArrayList<String>();
            list.add("2011");
            list.add("abc");
            list.add("2019");
            return list;
        }


}
