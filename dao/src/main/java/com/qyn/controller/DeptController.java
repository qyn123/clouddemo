package com.qyn.controller;


import com.qyn.entity.Dept;
import com.qyn.service.DeptSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
