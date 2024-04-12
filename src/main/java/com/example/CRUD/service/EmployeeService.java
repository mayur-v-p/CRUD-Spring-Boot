package com.example.CRUD.service;

//import com.example.CRUD.entity.Employee;
import com.example.CRUD.entity.Employee;

import java.util.List;
import java.util.Optional;
//import com.example.CRUD.request.EmployeeRequest;
//import org.springframework.stereotype.Service;


public interface EmployeeService {



    void saveEmployee(Employee employee);

    List<Employee> getEmployee();

    Optional<Employee> getEmployeeById(Long id);

    Boolean deletEmp(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
