package com.example.domain;

public class Manager extends Employee {
    private String deptName;
    private Employee[] staff;
    private int employeeCount;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
        this.employeeCount = 0;
    }
    @Override
    public void raiseSalary(double increase) {
        if(increase< 0){
            return;
        }
        super.raiseSalary(increase *0.5);
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartment:  " + getDeptName();
    }

    private int findEmployee(Employee e){
        for (int i = 0; i < employeeCount; i++){
            if (staff[i].equals(e))
                return i;
        }
        return -1;
    }

    public boolean addEmployee(Employee e){
        if(findEmployee(e) != -1){
            return false;
        }
        if (employeeCount>= staff.length){
            return false;
        }
        staff[employeeCount] = e;
        employeeCount++;
        return true;
    }

    public boolean removeEmployee(Employee e) {
        boolean found = false;

        Employee[] temp = new Employee[staff.length];
        int tempCount = 0;

        for (int i = 0; i <employeeCount; i++) {
            if (staff[i].getEmpId() != e.getEmpId()){
                temp[tempCount] = staff[i];
                tempCount++;
            } else {
                found = true;
                continue;
            }
        }
        if (found){
            staff = temp;
            employeeCount = tempCount;
        }

        return found;
    }

    public String getDeptName(){
        return deptName;
    }

    public void printStaffDetails(){
        System.out.println("Manager: " + getName());
        System.out.println("Staff Details:");

        for (int i = 0; i < employeeCount; i++){
            Employee e = staff[i];
            System.out.println("Employee ID: " + e.getEmpId() + "Name: " + e.getName());
        }
    }

}
