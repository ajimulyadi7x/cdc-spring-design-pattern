package com.cdc2023.springdesignpattern.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff() {
        Employee employee = new Employee();
        employee.setPosition(Position.STAFF);
        employee.setSalary(10000000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager() {
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(20000000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVicePresident() {
        Employee employee = new Employee();
        employee.setPosition(Position.VICE_PRESIDENT);
        employee.setSalary(30000000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeCLevel() {
        Employee employee = new Employee();
        employee.setPosition(Position.C_LEVEL);
        employee.setSalary(40000000L);
        return employee;
    }
}
