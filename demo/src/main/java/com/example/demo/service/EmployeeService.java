package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void createuser(Employee employee);

    List<Employee> getAllEmployee();

    boolean deleteUser(Integer id);
}
