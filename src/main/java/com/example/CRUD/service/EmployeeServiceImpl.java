package com.example.CRUD.service;

import com.example.CRUD.entity.Employee;
import com.example.CRUD.repo.EmployeeRepository;
//import com.example.CRUD.request.EmployeeRequest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    EmployeeRepository employeeRepository;


//    @Override
//    public void saveEmployee(Employee employee) {
//
////        Employee employee = new Employee();
//        employee.setName(employee.getName());
//        employee.setCompanyName(employee.getCompanyName());
//        employee.setAge(employee.getAge());
//        employee.setDept(employee.getDept());
//        employee.setSalary(employee.getSalary());
//        employeeRepository.save(employee);
//    }

    @Override
    public void saveEmployee(Employee employee) {


        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {

        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {

        return employeeRepository.findById(id);


    }

    @Override
    public Boolean deletEmp(Long id) {

        employeeRepository.deleteById(id);
        return true;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

        Optional<Employee> emp = employeeRepository.findById(id);

        if (emp.isPresent()){
            Employee employeee = emp.get();
            employeee.setName(employee.getName());
        employeee.setCompanyName(employee.getCompanyName());
        employeee.setAge(employee.getAge());
        employeee.setDept(employee.getDept());
        employeee.setSalary(employee.getSalary());
        employeeRepository.save(employeee);
        return employeee;
        }

        return null;
    }


}
