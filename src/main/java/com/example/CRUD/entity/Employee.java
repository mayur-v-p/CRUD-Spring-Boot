package com.example.CRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_info")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_Id")
    private Long empId;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "age")
    private String age;

    @Column(name = "dept")
    private String dept;

    @Column(name = "salary")
    private Long salary;


    public Employee(Long empId, String name, String companyName, String age, String dept, Long salary) {
        this.empId = empId;
        this.name = name;
        this.companyName = companyName;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee() {
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age='" + age + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }


}
