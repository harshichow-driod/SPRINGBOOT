package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeePayrollDTO {

    @NotEmpty(message = "Name cannot be null or empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name is invalid")
    private String name;

    private long salary;
}
