/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;
/*Write a java program to develop calculator aplication (Add,Subtract,Multiplication and Division) Using multiple inheritance.

/**
 *
 * @author prabin
 */
interface Calculator{
 void display();
}
class Addition implements Calculator{
    int a;
    int b;
    public Addition(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Addition Value is :"+(a+b));
    }
}
class Subtraction implements Calculator{
    int a;
    int b;
    public Subtraction(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Subtraction Value is :"+(a-b));
    }
}
class Multiplication implements Calculator{
    int a;
    int b;
    public Multiplication(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Multiplication Value is :"+(a*b));
    }
}
class Division implements Calculator{
    int a;
    int b;
    public Division(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Division Value is :"+(a/b));
    }
}
public class QN3{
    public static void main(String[] args){
        Calculator c=new Addition(10,5);
        c.display();
        Calculator d=new Subtraction(10,5);
        d.display();
        Calculator e=new Multiplication(10,5);
        e.display();
        Calculator f=new Division(10,5);
        f.display();
    }
}