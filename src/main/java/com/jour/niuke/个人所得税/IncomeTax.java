package com.jour.niuke.个人所得税;

import java.util.ArrayList;
import java.util.List;

public class IncomeTax {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("小明", 2500));
        employees.add(new Employee("小军", 8000));
        employees.add(new Employee("小红", 100000));

        //write your code here......
        for(Employee e:employees){
            double taxed = taxCalculate(e);
            e.setTax(taxed);
            System.out.println(e.getName() + "应该缴纳的个人所得税是：" + taxed);
        }


    }

    public static double taxCalculate(Employee employee){
        double salary = employee.getSalary();
        if(salary <= 1500){
            double tax = (salary - 3500) * 0.03 - 0;
            return tax >= 0 ? tax : 0;
        }else if(salary  > 1500 && salary <= 4500){
            double tax = (salary - 3500) * 0.1 - 105;
            return tax >= 0 ? tax : 0;
        }else if(salary > 4500 && salary <= 9000){
            double tax = (salary - 3500) * 0.2 - 555;
            return tax >= 0 ? tax : 0;
        }else if(salary > 9000 && salary <= 35000){
            double tax = (salary - 3500) * 0.25 - 1005;
            return tax >= 0 ? tax : 0;
        }else if(salary >= 35000 && salary <= 55000){
            double tax = (salary - 3500) * 0.3 - 2755;
            return tax >= 0 ? tax : 0;
        }else if(salary > 55000 && salary <= 80000){
            double tax = (salary - 3500) * 0.35 - 5505;
            return tax >= 0 ? tax : 0;
        }else if(salary > 80000){
            double tax = (salary - 3500) * 0.45 - 13505;
            return tax >= 0 ? tax : 0;
        }
        return 0;
    }
}
class Employee{
    private String name;
    private double salary;
    private double tax;

    public double getTax() {
        return tax;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}


