package com.egehan.cloudcomputingassignment.repository;

import com.egehan.cloudcomputingassignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
