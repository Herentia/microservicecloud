package com.pb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author haohan
 * 04/15/2019 - 03:45 下午
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_App.class, args);
    }

}
