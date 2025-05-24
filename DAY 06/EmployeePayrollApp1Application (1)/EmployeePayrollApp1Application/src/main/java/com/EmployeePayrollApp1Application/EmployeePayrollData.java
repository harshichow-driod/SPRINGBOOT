package com.EmployeePayrollApp1Application;



import jakarta.persistence.*;
        import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private long salary;
}