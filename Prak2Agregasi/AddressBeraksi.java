/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2Agregasi;

/**
 *
 * @author imadw
 */
public class AddressBeraksi {
    public static void main(String[]args){
        Address ad= new Address(10, "Bareilly", "UP", "India");
        Student st= new Student(1,"Aashi", ad);
        
        System.out.println("Roll no: " +st.rno);
        System.out.println("Name: " + st.stName);
        System.out.println("Street: " + st.stAddr.strNum);
        System.out.println("City: " + st.stAddr.city);
        System.out.println("State: " + st.stAddr.state);
        System.out.println("Country: " + st.stAddr.country);
    }
    
}
