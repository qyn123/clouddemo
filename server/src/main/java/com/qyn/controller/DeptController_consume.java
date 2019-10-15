package com.qyn.controller;

import com.qyn.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author qiaoyn
 **/
@RestController
public class DeptController_consume {

   // private static final String REST_URL_REFIX = "http://localhost:8081";
   private static final String REST_URL_REFIX = "http://PROVIDER-DEPT-8001";

    @Autowired
    private RestTemplate restTemplate;

    /**
         * @author qiaoyn
         * 消费端
         *请求地址，请求参数，返回对象类型localhost/consumer/dept/find
         */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/find",method =RequestMethod.GET )
    public List<Dept> find(){
        return restTemplate.getForObject(REST_URL_REFIX+"/findAll",List.class);
    }

    @RequestMapping(value = "/consume/add/dept")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_REFIX+"/add/dept",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get",method =RequestMethod.GET )
    public Dept get(){
        return restTemplate.getForObject(REST_URL_REFIX+"/{id}",Dept.class);
    }

}
