package com.qyn.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qyn.entity.Dept;
import com.qyn.service.DeptSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




/**
 * @author qiaoyn
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptSrv deptSrv = null;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")//一旦服务调用失败并抛出了错误异常信息，会自动调用 @HystrixCommand注解好的fallbackMethod方法
    public Dept get(@PathVariable("id") Long id){
            Dept dept = this.deptSrv.findById(id);
        if (null == dept){
           throw new RuntimeException("该Id"+ id + "没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该Id"+ id + "没有对应的信息");

    }

}
