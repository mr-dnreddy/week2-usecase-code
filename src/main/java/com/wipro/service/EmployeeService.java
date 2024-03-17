package com.wipro.service;

import java.util.List;

import com.wipro.model.Employee;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(int id);
    List<Employee> getByWorkLocation(String workLocation);
    List<Employee> getByFirstName(String firstName);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    void addNewEmployee(Employee employee);
}

