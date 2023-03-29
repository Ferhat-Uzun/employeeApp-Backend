package com.ferhat.employeeApp.service;

import com.ferhat.employeeApp.entity.Employee;
import com.ferhat.employeeApp.exception.EmployeeNotFoundException;
import com.ferhat.employeeApp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ferhat on 3/26/2023
 * @project employeeApp
 */
@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee findEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(
                () -> new EmployeeNotFoundException("User not found")
        );
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee newEmployee){
        Employee employee = employeeRepository.findById(newEmployee.getId()).orElseThrow(
                () -> new EmployeeNotFoundException("User not found"));
        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        employee.setEmail(newEmployee.getEmail());

        employeeRepository.save(employee);
        return employee;
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
