package com.ferhat.employeeApp.repository;

import com.ferhat.employeeApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ferhat on 3/26/2023
 * @project employeeApp
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
