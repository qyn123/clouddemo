package com.qyn.dao;

import com.qyn.entity.Dept;

import java.util.List;

/**
 * @author qiaoyn
 **/
public interface DeptDao {

    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
