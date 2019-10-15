package com.qyn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qiaoyn
 * 服务熔断
 **/
@SpringBootApplication
@MapperScan("com.qyn.dao")
@EnableEurekaClient //本服务启动后会自动注册到eureka服务中
@EnableCircuitBreaker //对hystrix熔断机制的支持
public class Provider_dept_hystrix_8001 {
    public static void main(String args[]){
        SpringApplication.run(Provider_dept_hystrix_8001.class,args);

    }
}
