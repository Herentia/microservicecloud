package com.pb.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author haohan
 * 04/15/2019 - 04:31 下午
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced                       //Ribbon负载均衡，默认 为轮询的方式
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
