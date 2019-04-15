package com.pb.springcloud.controller;

import com.pb.springcloud.entities.Dept;
import com.pb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author haohan
 * 04/15/2019 - 03:38 下午
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public Boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept findById(@PathVariable("id") Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}
