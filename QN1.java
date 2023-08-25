/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author prabin
 */
/*Create a base class fruit which has name,taste and size as tis attributes.Amethod called eat() is created which describes
the name of the fruit and its taste .Inherit the same in 2 other class Apple and orange and override the eat() method to represent each
fruit taste.*/
class fruit{
    String name;
    String taste;
    String size;
    public fruit(String name,String taste, String size){
        this.name=name;
        this.taste=taste;
        this.size=size;
        
    }
    void eat(){
        System.out.println(name+" Taste "+taste+".It is "+size+" in size.");
    }
}
class apple extends fruit{
    public apple(String name,String taste,String size){
        super(name,taste,size);
        
    }
    void displayapple(){
        eat();
    }
}
class orange extends fruit{
    public orange(String name,String taste,String size){
        super(name,taste,size);
        
    }
    void displayorange(){
        eat();
    }
}
public class QN1 {
    public static void main(String[] args){
        apple a=new apple("Apple","Sweet","Small");
        a.displayapple();
        orange o=new orange("Orange","Sour and Sweet","Medium");
        o.displayorange();
    }
    
}
