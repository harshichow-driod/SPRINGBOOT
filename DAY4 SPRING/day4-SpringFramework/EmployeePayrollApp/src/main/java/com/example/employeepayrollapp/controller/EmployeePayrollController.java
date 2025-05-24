package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService service;

    @GetMapping("/")
    public List<EmployeePayrollData> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getEmployee(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@Valid @RequestBody EmployeePayrollData employee) {
        return service.createEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeePayrollData employee) {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted successfully";
    }
}
