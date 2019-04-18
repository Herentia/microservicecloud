package com.pb.springcloud.service;

import com.pb.springcloud.entities.Dept;

import java.util.List;

/**
 * @author haohan
 * 04/15/2019 - 03:28 下午
 */
public interface DeptService {

    public Boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
