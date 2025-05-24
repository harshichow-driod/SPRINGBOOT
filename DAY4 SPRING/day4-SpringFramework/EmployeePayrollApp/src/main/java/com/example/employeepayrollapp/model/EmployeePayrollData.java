package com.example.employeepayrollapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Positive(message = "Salary must be positive")
    private long salary;

    public void setId(int id) {
    }

    // Getters and Setters
}