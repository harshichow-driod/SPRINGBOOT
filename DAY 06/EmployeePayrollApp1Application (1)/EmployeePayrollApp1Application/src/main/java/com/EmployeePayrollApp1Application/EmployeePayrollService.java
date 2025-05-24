package com.EmployeePayrollApp1Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    public List<EmployeePayrollData> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeePayrollData getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayrollData createEmployee(EmployeePayrollDTO dto) {
        EmployeePayrollData data = new EmployeePayrollData();
        data.setName(dto.getName());
        data.setSalary(dto.getSalary());
        return repository.save(data);
    }

    public EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData data = getEmployeeById(id);
        if (data != null) {
            data.setName(dto.getName());
            data.setSalary(dto.getSalary());
            return repository.save(data);
        }
        return null;
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}