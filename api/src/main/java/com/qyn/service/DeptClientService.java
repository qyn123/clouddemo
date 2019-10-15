package com.qyn.service;

import com.qyn.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author qiaoyn
 **/
@FeignClient(value = "provider-dept-8001")
public interface DeptClientService {

    @RequestMapping(value = "/dept/find",method = RequestMethod.GET)
    List<Dept> findDeptList();
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    boolean addDept(Dept dept);

}
