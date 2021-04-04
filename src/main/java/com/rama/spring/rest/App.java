package com.rama.spring.rest;

import com.rama.spring.rest.configuration.MyConfig;
import com.rama.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();

        Employee empById = communication.getEmployee(4);

        communication.deleteEmployee(10);

        System.out.println();
    }
}
