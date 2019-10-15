package com.qyn;

import com.qyn.myRule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author qiaoyn
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
//在启动该微服务的时候就能访问自定义的ribbon配置类，从而使配置生效
@RibbonClient(name = "provider-dept-8001",configuration = MyselfRule.class)//负载均衡自定义算法规则
public class consume_dept_80 {
    public static void main(String args[]){
        SpringApplication.run(consume_dept_80.class,args);
    }
}
