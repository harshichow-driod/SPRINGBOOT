package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getAllEmployees();
    EmployeePayrollData getEmployeeById(int id);
    EmployeePayrollData createEmployee(EmployeePayrollData employee);
    EmployeePayrollData updateEmployee(int id, EmployeePayrollData employee);
    void deleteEmployee(int id);
}
