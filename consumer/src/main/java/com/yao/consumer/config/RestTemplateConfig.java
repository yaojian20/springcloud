package com.yao.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yaojian on 2021/12/3 14:46
 *
 * @author
 */

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    //@LoadBalanced表示需要做负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
