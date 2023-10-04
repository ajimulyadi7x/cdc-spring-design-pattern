package com.cdc2023.springdesignpattern.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototypeApplication() {
        Employee employeeStaff = applicationContext.getBean("employeeStaff", Employee.class);
        employeeStaff.setName("Ryuki");
        employeeStaff.setSalary(10000000L);
        Employee employeeManager = applicationContext.getBean("employeeManager", Employee.class);
        employeeManager.setName("Ryuga");
        employeeManager.setSalary(20000000L);
        Employee employeeVicePresident = applicationContext.getBean("employeeVicePresident", Employee.class);
        employeeVicePresident.setName("Ita");
        employeeVicePresident.setSalary(30000000L);
        Employee employeeCLevel = applicationContext.getBean("employeeCLevel", Employee.class);
        employeeCLevel.setName("Aji");
        employeeCLevel.setSalary(40000000L);

        System.out.println(employeeStaff);
        System.out.println(employeeManager);
        System.out.println(employeeVicePresident);
        System.out.println(employeeCLevel);

    }

}