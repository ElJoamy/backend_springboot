package com.upb.projecttwo.services;

import com.upb.projecttwo.error.EmployeeNotFoundException;
import com.upb.projecttwo.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employeeList = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeId() == null) {
            employee.setEmployeId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeList
                .stream()
                .filter(employee -> employee.getEmployeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException(" "+ "Employee not found with ID "+id));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee deleteEmployeeById(String id) {
        Employee deletedEmployee = employeeList.stream()
                .filter(employee -> employee.getEmployeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException(" " + "Employee not found with ID " + id));
        employeeList.remove(deletedEmployee);
        return deletedEmployee;
    }

    @Override
    public Employee deleteAllEmployees() {
        employeeList.clear();
        return null;
    }

    @Override
    public Employee updateEmployeeById(String id, Employee employee) {
        Employee updatedEmployee = employeeList.stream()
                .filter(employee1 -> employee1.getEmployeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException(" " + "Employee not found with ID " + id));
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setLastName(employee.getLastName());
        updatedEmployee.setEmailId(employee.getEmailId());
        updatedEmployee.setDeparmentId(employee.getDeparmentId());
        return updatedEmployee;
    }
}
