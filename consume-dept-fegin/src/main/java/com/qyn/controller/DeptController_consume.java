package com.qyn.controller;

import com.qyn.entity.Dept;
import com.qyn.service.DeptClientService;
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

    @Autowired
    private DeptClientService deptClientService;

    /**
         * @author qiaoyn
         * 消费端
         *请求地址，请求参数，返回对象类型localhost/consumer/dept/find
         */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/find",method =RequestMethod.GET )
    public List<Dept> find(){
        return deptClientService.findDeptList();
    }

    @RequestMapping(value = "/consume/add/dept")
    public boolean add(Dept dept){
        return deptClientService.addDept(dept);
    }

}
