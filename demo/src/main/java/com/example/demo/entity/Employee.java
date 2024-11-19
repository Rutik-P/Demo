package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;


}
