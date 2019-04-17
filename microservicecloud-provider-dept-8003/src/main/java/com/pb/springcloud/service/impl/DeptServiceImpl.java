package com.pb.springcloud.service.impl;

import com.pb.springcloud.dao.DeptDao;
import com.pb.springcloud.entities.Dept;
import com.pb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haohan
 * 04/15/2019 - 03:29 下午
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public Boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    public List<Dept> findAll(){
        return deptDao.findAll();
    }

}
