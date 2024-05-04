/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manageemployeesalary;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employee {
    private String code;
    private String fullName;
    private int yearsOfService;
    private double salaryCoefficient;
    private double basicSalary;

    public Employee(String code, String fullName, int yearsOfService, double salaryCoefficient, double basicSalary) {
        this.code = code;
        this.fullName = fullName;
        this.yearsOfService = yearsOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public Employee() {
    }
    
    public double getSalary(){
        return salaryCoefficient * basicSalary;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Code: ");
        code = sc.nextLine();
        System.out.println("FullName: ");
        fullName = sc.nextLine();
        System.out.println("Years of service: ");
        yearsOfService = sc.nextInt();
        System.out.println("Salary Coefficient: ");
        salaryCoefficient = sc.nextDouble();
        System.out.println("Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
    public void printEmployee(){
        System.out.println("Code: "+code+"\nFullName:"+fullName+"\nSalary: "+this.getSalary());
    }
}
