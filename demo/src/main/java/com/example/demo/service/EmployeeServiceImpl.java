package com.example.demo.service;

import com.example.demo.Respository.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public boolean deleteUser(Integer id) {
        if(empRepo.existsById(id)) {
             empRepo.deleteById(id);
             return  true;
        }
        else {
            return false;
        }
    }

    @Override
    public Optional<Employee> getEmployee(Integer id) {
        if(empRepo.existsById(id)){
            return empRepo.findById(id);
        }
        else{
            return Optional.empty();
        }


    }


}
