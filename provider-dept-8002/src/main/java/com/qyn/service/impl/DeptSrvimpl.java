package com.qyn.service.impl;


import com.qyn.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qyn.dao.DeptDao;
import com.qyn.service.DeptSrv;

import java.util.List;

/**
 * @author qiaoyn
 **/
@Service
public class DeptSrvimpl implements DeptSrv {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
