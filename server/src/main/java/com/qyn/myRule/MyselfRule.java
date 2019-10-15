package com.qyn.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiaoyn
 **/
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//ribbon默认的是轮循算法，我们自定义为随机算法
    }
}
