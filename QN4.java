/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author prabin
 */
abstract class rrCampus{
    void display(){}
    void detail(){
    System.out.println("I am the student of RR Campus.");
}}
class prabin extends rrCampus{
    String name;
    String faculty;
    public prabin(String name,String faculty){
        this.name=name;
        this.faculty=faculty;
    }
    void display(){
        super.detail();
        System.out.println("My name is "+name+". I read in "+faculty+" Faculty.");
    }
}
public class QN4 {
  public static void main(String[] args){
      rrCampus r=new prabin("Prabin","BCA");
      r.display();
  }  
}
