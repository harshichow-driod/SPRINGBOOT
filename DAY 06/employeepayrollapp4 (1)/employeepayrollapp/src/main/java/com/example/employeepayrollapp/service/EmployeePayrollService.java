package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    @Override
    public List<EmployeePayrollData> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeeById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeePayrollException("Employee with ID " + id + " not found"));
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeePayrollDTO dto) {
        EmployeePayrollData data = new EmployeePayrollData(0, dto.getName(), dto.getSalary());
        return repository.save(data);
    }

    @Override
    public EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData data = getEmployeeById(id);
        data.setName(dto.getName());
        data.setSalary(dto.getSalary());
        return repository.save(data);
    }

    @Override
    public void deleteEmployee(int id) {
        EmployeePayrollData data = getEmployeeById(id);
        repository.delete(data);
    }
}
