package com.snowflakes.demo.service;

import com.snowflakes.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
     List<Employee> createEmployee(List<Employee> employee);
     List<Employee> getAllEmployee();
     Employee getEmployeeByID(int id);
     Employee updateEmployee(int id ,Employee employee);
     void deleteEmployee(int id);

}
