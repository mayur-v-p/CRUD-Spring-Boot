package com.example.CRUD.controller;

import com.example.CRUD.entity.Employee;
import com.example.CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> SaveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return new  ResponseEntity<>("added", HttpStatus.OK);
    }

    @GetMapping("/get")
    public List<Employee> employeeGet(){
        return employeeService.getEmployee();
    }

    @GetMapping("/get/{id}")
    public Optional<Employee> getEmpById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmp(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmpId(@PathVariable Long id){
        Boolean yes = employeeService.deletEmp(id);
        if (yes){
            return "delete";

        }else {
            return "Not";
        }
    }
}
