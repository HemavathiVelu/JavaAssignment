package com.hemavathi.assignment.utilities;

//Employee Utility

import com.hemavathi.assignment.employee.Employee;
import com.hemavathi.assignment.employee.Manager;
import com.hemavathi.assignment.employee.Developer;

public class EmployeeUtilities {

    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDept());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getPro_lang());
        }
    }
}

