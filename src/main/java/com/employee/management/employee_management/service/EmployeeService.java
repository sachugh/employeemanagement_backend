package com.employee.management.employee_management.service;

import com.employee.management.employee_management.entity.Employee;
import com.employee.management.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
  private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(Long id) {
        return employeeRepository.findById(id);
    }
}
