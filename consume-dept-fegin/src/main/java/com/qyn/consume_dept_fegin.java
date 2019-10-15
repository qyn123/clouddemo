package com.qyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qiaoyn
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.qyn"} )
@ComponentScan("com.qyn")
public class consume_dept_fegin {
    public static void main(String args[]){
        SpringApplication.run(consume_dept_fegin.class,args);
    }
}
