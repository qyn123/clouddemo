package com.qyn.controller;


import com.qyn.entity.Dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qyn.service.DeptSrv;

import java.util.List;


/**
 * @author qiaoyn
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptSrv deptSrv;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Dept> find(){
        return deptSrv.findAll();
    }

    @RequestMapping(value = "/add/dept",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptSrv.addDept(dept);
    }
}
