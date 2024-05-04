/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manageemployeesalary;
import java.util.ArrayList;
/**
 *
 * @author Student
 */
public class ManageEmployeeSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i<n;i++){
            Employee emp = new Employee();
            emp.Input();
            list.add(emp);
        }
        
    }
}
