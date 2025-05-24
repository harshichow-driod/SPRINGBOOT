package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService service;

    @GetMapping("/")
    public List<EmployeePayrollData> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeePayrollData> create(@Valid @RequestBody EmployeePayrollDTO dto) {
        return ResponseEntity.ok(service.createEmployee(dto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeePayrollData> update(@PathVariable int id,
                                                      @Valid @RequestBody EmployeePayrollDTO dto) {
        return ResponseEntity.ok(service.updateEmployee(id, dto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
