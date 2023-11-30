package com.upb.projecttwo.services;

import java.util.List;

import com.upb.projecttwo.models.Department;

public interface DepartmentService {
    Department save(Department department);

    Department findById(String id);

    List<Department> findAll();

    Department deleteById(String id);

    Department deleteAll();

    Department updateById(String id, Department department);
    
}
