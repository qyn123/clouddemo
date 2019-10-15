package com.qyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author qiaoyn
 **/
@SpringBootApplication
@EnableZuulProxy
public class zuulapplication {
    public static void main(String args[]){
        SpringApplication.run(zuulapplication.class,args);
    }
}
