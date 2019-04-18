package com.pb.springcloud.controller;

import com.pb.springcloud.entities.Dept;
import com.pb.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author haohan
 * 04/15/2019 - 04:34 下午
 */
@RestController
public class DeptController_Consumer {


    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.add(dept);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list(){
        return this.deptClientService.list();
    }

}
