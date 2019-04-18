package com.pb.springcloud.dao;

import com.pb.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author haohan
 * 04/15/2019 - 03:09 下午
 */
@Mapper
public interface DeptDao {

    public Boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
