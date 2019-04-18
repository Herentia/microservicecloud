package com.pb.springcloud;

import com.pb.myrule.RandomRule_HH;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author haohan
 * 04/15/2019 - 04:40 下午
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = RandomRule_HH.class)
@EnableFeignClients(basePackages= {"com.pb.springcloud"})
@ComponentScan("com.pb.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }

}
