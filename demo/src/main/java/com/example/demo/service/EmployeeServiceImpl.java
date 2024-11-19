package com.example.demo.service;

import com.example.demo.Respository.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    @Override
    public void createuser(Employee employee) {
        empRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }
}
