package com.snowflakes.demo.testcontroller;

import com.snowflakes.demo.entity.Employee;
import com.snowflakes.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id )
    {
        return new ResponseEntity<>(employeeService.getEmployeeByID(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Employee>> createEmployee(@RequestBody List<Employee> employees) {
        List<Employee> savedEmployees = employeeService.createEmployee(employees);
        return new ResponseEntity<>(savedEmployees, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.updateEmployee(id,employee),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id )
    {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build(); //provide 204 response that no content is being returned
    }


}
