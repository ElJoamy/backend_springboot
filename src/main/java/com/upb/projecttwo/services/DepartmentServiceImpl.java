package com.upb.projecttwo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.upb.projecttwo.models.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    
    List<Department> departmentList = new ArrayList<>();
    @Override
    public Department save(Department department) {
        if (department.getDepartmentId() == null) {
            department.setDepartmentId(UUID.randomUUID().toString());
        }
        departmentList.add(department);
        return department;
    }
    
}
