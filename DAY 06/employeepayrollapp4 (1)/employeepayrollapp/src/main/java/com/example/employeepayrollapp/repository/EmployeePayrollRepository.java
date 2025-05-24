package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
}
