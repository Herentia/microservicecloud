package com.pb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author haohan
 * 04/15/2019 - 03:45 下午
 */
@SpringBootApplication
@EnableEurekaClient                 //本服务启动后会自动注册到eureka
@EnableDiscoveryClient              //服务发现
@EnableCircuitBreaker               //对hystrix熔断机制的支持
public class DeptProvider8001_hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_hystrix_App.class, args);
    }

}
