package com.upb.projecttwo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.upb.projecttwo.error.DepartmentNotFoundException;
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

    @Override
    public Department findById(String id) {
        return departmentList
                .stream()
                .filter(department -> department.getDepartmentId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new DepartmentNotFoundException(" " + "Department not found with ID " + id));
    }

    @Override
    public List<Department> findAll() {
        return departmentList;
    }

    @Override
    public Department deleteById(String id) {
        Department deletedDepartment = departmentList.stream()
                .filter(department -> department.getDepartmentId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new DepartmentNotFoundException(" " + "Department not found with ID " + id));
        departmentList.remove(deletedDepartment);
        return deletedDepartment;
    }

    @Override
    public Department deleteAll() {
        departmentList.clear();
        return null;
    }

    @Override
    public Department updateById(String id, Department department) {
        Department updatedDepartment = departmentList.stream()
                .filter(department1 -> department1.getDepartmentId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new DepartmentNotFoundException(" " + "Department not found with ID " + id));
        updatedDepartment.setName(department.getName());
        updatedDepartment.setLead(department.getLead());
        return updatedDepartment;
    }
    
}
