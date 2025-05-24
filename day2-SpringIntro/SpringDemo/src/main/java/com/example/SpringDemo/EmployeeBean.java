// EmployeeBean.java
package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    @Autowired
    private DepartmentBean departmentBean;

    public void showDetails() {
        System.out.println("Department: " + departmentBean.getDepartmentName());
    }
}
