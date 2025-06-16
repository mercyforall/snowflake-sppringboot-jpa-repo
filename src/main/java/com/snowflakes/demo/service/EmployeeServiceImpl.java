package com.snowflakes.demo.service;

import com.snowflakes.demo.entity.Employee;
import com.snowflakes.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//    Employee createEmployee(Employee employee);
//    List<Employee> getAllEmployee();
//    Employee getEmployeeByID(int id);
//    Employee updateEmployee(int id ,Employee employee);
//    void deleteEmployee(int id);


    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List <Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return employeeRepo.findById(id).orElseThrow(() -> new RuntimeException("employee not found " + id));
    }

    @Override
    public List<Employee> createEmployee(List<Employee> employees) {
        return employeeRepo.saveAll(employees);
    }

    @Override
    public Employee updateEmployee(int id, Employee employeeDetails) {
        Employee employee = getEmployeeByID(id);
        employee.setAddress(employeeDetails.getAddress());
        employee.setAge(employeeDetails.getAge());
        employee.setName(employeeDetails.getName());
        employee.setSalary(employeeDetails.getSalary());
        employee.setId(employeeDetails.getId());
        employee.setSalary(employeeDetails.getSalary());
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
    }

