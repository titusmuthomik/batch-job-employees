package com.employees.config;

import com.employees.model.Employee;
import org.springframework.batch.item.ItemProcessor;


public class DBLogProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        System.out.println("Inserting employee : " + employee);
        return employee;
    }

}
