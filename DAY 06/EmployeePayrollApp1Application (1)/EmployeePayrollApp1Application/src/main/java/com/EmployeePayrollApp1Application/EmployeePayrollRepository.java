package com.EmployeePayrollApp1Application;


import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
}