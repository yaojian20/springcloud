package com.yao.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaojian on 2021/12/3 9:31
 *
 * @author
 */
@RestController
@Slf4j
public class UserController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        log.info("input name is :" + name);

        return "hello world " + name;
    }


}
