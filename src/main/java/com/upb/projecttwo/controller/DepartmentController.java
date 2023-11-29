package com.upb.projecttwo.controller;

import com.upb.projecttwo.models.Department;
import com.upb.projecttwo.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.save(department);
    }
    
}
