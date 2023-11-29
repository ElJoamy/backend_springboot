package com.upb.projecttwo.services;

import java.util.List;

import com.upb.projecttwo.models.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee getEmployeeById(String id);

    List<Employee> getAllEmployees();
}
