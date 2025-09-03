/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2Agregasi;

/**
 *
 * @author imadw
 */
public class Address {
    int strNum;
    String city;
    String state;
    String country;
    
    Address (int street, String c, String st, String country){
       this.strNum = street;
       this.city = c;
       this.state = st;
       this.country = country;
    }
}

class Student {
    int rno;
    String stName;
    
    
    Address stAddr; // Agregrasi (Student has-a Address)
    Student (int roll, String name, Address address){
 
         this.rno = roll;
         this.stName = name;
         this.stAddr = address;
    }
}
