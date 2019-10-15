package com.qyn.dao;

import com.qyn.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author qiaoyn
 **/
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
