package com.example;
import com.example.business.EmployeeStockPlan;
import com.example.domain.Employee;
import com.example.domain.Admin;
import com.example.domain.Manager;
import com.example.domain.Director;
import com.example.domain.Engineer;
import java.text.NumberFormat;

public class EmployeeTest {
    public static void main(String[] args) {
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);
        Manager man = new Manager(207, "Barbara Jonson", "054-12-2367", 109501.36, "Us Marketing");
        Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", 1000000.00);
        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(eng, esp);
        man.setName("Barbara Johnson-Smythe");
        man.raiseSalary(10000.00);

//        printEmployee(eng);
//        printEmployee(man);
//        printEmployee(adm);
//        printEmployee(dir);

    }


    public static void printEmployee (Employee emp, EmployeeStockPlan esp) {
        System.out.println(emp);
        System.out.println("Stock Options: " + esp.grantstock(emp));
        System.out.println("Employee Type: " + emp.getClass().getSimpleName());
    }
//        System.out.println(); // Print a blank line as a separator
//// Print out the data in this Employee object
//        System.out.println ("Employee id: " + emp.getEmpId());
//        System.out.println ("Employee name: " + emp.getName());
//        System.out.println ("Employee Soc Sec #: " + emp.getSsn());
//        System.out.println ("Employee salary: " + NumberFormat.getCurrencyInstance().format(emp.getSalary()));
//    }

}



