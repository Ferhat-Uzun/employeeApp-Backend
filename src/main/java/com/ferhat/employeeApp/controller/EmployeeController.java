package com.ferhat.employeeApp.controller;

import com.ferhat.employeeApp.entity.Employee;
import com.ferhat.employeeApp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ferhat on 3/26/2023
 * @project employeeApp
 */

@RestController
@RequestMapping("employee")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.findEmployee(id);
    }

    @PostMapping("add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateemployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
