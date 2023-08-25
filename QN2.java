/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author prabin
 */
/*Write a java program to create class named shape.It should contain one method, area() that prints area of shape, For this class create two subclass
Triangle and Rectangel and each class should override the parent class function area() . create object of triangle and Rectangle to observe the 
polymorphic nature of class*/
class shape{
 void displayarea(){
System.out.println("The area of shape:");
}}
class triangle extends shape{
    float base;
    float height;
public triangle(float base,float height){
    this.base=base;
    this.height=height;
   
}
void displayarea(){
float area=(1.0f/2.0f)*base*height;
System.out.println("The area of triangle is "+area);

}}
class rectangle extends shape{
    float length;
    float breadth;
public rectangle(float length,float breadth){
    this.length=length;
    this.breadth=breadth;
   
}
void displayarea(){
float area=length*breadth;
System.out.println("The area of rectangle is "+area);

}}

public class QN2 {
    public static void main(String[] args){
        rectangle r =new rectangle(10.0f,4.0f);
        triangle t=new triangle(5.0f,6.0f);
        r.displayarea();
        t.displayarea();
        
    }
}
    

