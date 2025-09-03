/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2Agregasi;

/**
 *
 * @author imadw
 */
public class VehicleBeraksi {
    public static void main(String []args){
        Speed speed = new Speed ();
        speed.setMax(120);
        Van van = new Van();
        
        van.setVin("abcd1233");
        van.setSpeed(speed);
        van.print();
    }
}
