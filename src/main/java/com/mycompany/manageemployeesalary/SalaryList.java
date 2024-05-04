/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manageemployeesalary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class SalaryList {
    private ArrayList<Employee> list = new ArrayList<>();
    
    public SalaryList() {
    }
    public SalaryList(Employee newEmployee){
        this.list.add(newEmployee);
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n;i++){
            Employee emp = new Employee();
            emp.Input();
            list.add(emp);
        }
    }
    public void printHighestSalary(){
        double maxSalary = 0;
        for (Employee i : list){
            if (i.getSalary() >= maxSalary){
                maxSalary = i.getSalary();
            }
        }
        for (Employee i : list){
            if (i.getSalary() == maxSalary){
                i.printEmployee();
            }
        } 
    }
    public SalaryList sort(){
        
    }
    public void printSalary(){
        for (Employee i : list){
            i.printEmployee();
        }
    }
}
