package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @GetMapping("/get")
    public  String getData(){
        return "Data is Present";//status(HttpStatus.CREATED).body("HTTP Status will be CREATED ");
    }

    @GetMapping("/info")
    public ResponseEntity<String> getInfo(){
        return ResponseEntity.status(HttpStatus.CREATED).body("HTTP Status will be CREATED ");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody Employee employee){
        empService.createuser(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("User Successfully Created");
    }

    @GetMapping("/show")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = empService.getAllEmployee();
        if (employees.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(employees);
    }

}
