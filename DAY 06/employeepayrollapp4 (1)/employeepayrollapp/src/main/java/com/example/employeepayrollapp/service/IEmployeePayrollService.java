package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getAllEmployees();
    EmployeePayrollData getEmployeeById(int id);
    EmployeePayrollData createEmployee(EmployeePayrollDTO dto);
    EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO dto);
    void deleteEmployee(int id);
}
