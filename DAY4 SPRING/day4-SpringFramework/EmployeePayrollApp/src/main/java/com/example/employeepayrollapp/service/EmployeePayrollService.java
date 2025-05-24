package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    public List<EmployeePayrollData> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeePayrollData getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayrollData createEmployee(EmployeePayrollData employee) {
        return repository.save(employee);
    }

    public EmployeePayrollData updateEmployee(int id, EmployeePayrollData employee) {
        employee.setId(id);
        return repository.save(employee);
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
