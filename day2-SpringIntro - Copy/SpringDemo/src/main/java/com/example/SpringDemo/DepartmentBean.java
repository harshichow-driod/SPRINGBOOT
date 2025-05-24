// DepartmentBean.java
package com.example.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    public String getDepartmentName() {
        return "Engineering";
    }
}
