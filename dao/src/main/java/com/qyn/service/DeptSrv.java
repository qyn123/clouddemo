package com.qyn.service;

import com.qyn.entity.Dept;

import java.util.List;

/**
 * @author qiaoyn
 **/
public interface DeptSrv {
    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
