package com.employee.management.employee_management.controller;

import com.employee.management.employee_management.entity.Employee;
import com.employee.management.employee_management.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

}
