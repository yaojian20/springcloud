package com.yao.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yaojian on 2021/12/3 14:43
 *
 * @author
 */

@RestController
@Slf4j
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(String name){
        String forObject = restTemplate.getForObject("http://EUREKA-SERVICE/hello?name=" + name, String.class);
        return forObject;
    }


}
