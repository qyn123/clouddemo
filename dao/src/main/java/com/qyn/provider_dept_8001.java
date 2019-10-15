package com.qyn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qiaoyn
 **/
@SpringBootApplication
@MapperScan("com.qyn.dao")
@EnableEurekaClient //本服务启动后会自动注册到eureka服务中
public class provider_dept_8001 {
    public static void main(String args[]){
        SpringApplication.run(provider_dept_8001.class,args);

    }
}
