package com.example.domain;

import java.text.NumberFormat;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId= empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }
        this.name = name;
    }

    public void raiseSalary(double increase) {
        if(increase< 0){
            return;
        }
        this.salary += increase;
    }

    @Override
    public String toString(){
        return "Employee ID " + empId + "\n" +
                "Employee Name: " + name + "\n" +
                "Employee SSN: " + ssn + "\n" +
                "Employee Salary: " + salary + NumberFormat.getCurrencyInstance().format(getSalary());
    }

    public int getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public String getSsn(){
        return ssn;
    }
    public double getSalary() {
        return salary;
    }

}
