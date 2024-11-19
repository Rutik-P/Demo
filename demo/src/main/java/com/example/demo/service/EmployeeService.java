package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void createuser(Employee employee);

    List<Employee> getAllEmployee();

    boolean deleteUser(Integer id);

    Optional<Employee> getEmployee(Integer id);
}
