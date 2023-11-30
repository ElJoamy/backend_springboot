package com.upb.projecttwo.controller;

import com.upb.projecttwo.models.Department;
import com.upb.projecttwo.services.DepartmentService;

import java.util.List;

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

    @GetMapping("/{id}")
    public Department findById(@PathVariable String id) {
        return departmentService.findById(id);
    }

    @GetMapping("/all")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @DeleteMapping("/{id}")
    public Department deleteById(@PathVariable String id) {
        return departmentService.deleteById(id);
    }

    @DeleteMapping("/all")
    public Department deleteAll() {
        return departmentService.deleteAll();
    }

    @PutMapping("/{id}")
    public Department updateById(@PathVariable String id, @RequestBody Department department) {
        return departmentService.updateById(id, department);
    }
    
}
