package com.cdc2023.springdesignpattern.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    public Employee employeeStaff() {
        Employee employee = new Employee();
        employee.setPosition(Position.STAFF);
        return employee;
    }

    @Bean
    public Employee employeeManager() {
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        return employee;
    }

    @Bean
    public Employee employeeVicePresident() {
        Employee employee = new Employee();
        employee.setPosition(Position.VICE_PRESIDENT);
        return employee;
    }

    @Bean
    public Employee employeeCLevel() {
        Employee employee = new Employee();
        employee.setPosition(Position.C_LEVEL);
        return employee;
    }
}
