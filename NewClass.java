/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author prabin
 */
public class NewClass {
    int Eid;
    String Ename;
    String Eaddress;
    int Salary;
    public NewClass(int E,String N,String A,int S){
        Eid=E;
        Ename=N;
        Eaddress=A;
        Salary=S;
    }
    void display(){
        System.out.println("Employee Id:"+Eid);
        System.out.println("Employee name="+Ename);
        System.out.println("Employee Address="+Eaddress);
        System.out.println("Salary of the employee="+Salary);
    }
    
}

