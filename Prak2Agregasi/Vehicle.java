/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2Agregasi;

/**
 *
 * @author imadw
 */
public class Vehicle {
    private String vin;
    public String getVin(){
        return vin;
    }
    public void setVin (String vin){
        //perbaikan agar VIN tersimpan
      this.vin = vin;
        
    }
}

class Speed{
    private double max;
    
    public double getMax(){
        return max;
    }
    public void setMax (double max){
        this.max = max;
    }
}
//  Van mewarisi Vehicle (inheritance)
class Van extends Vehicle {
    private Speed speed;  //Van has-a Speed (agregasi)
    
    public Speed getSpeed(){
        return speed;
    }
    public void setSpeed(Speed speed){
        this.speed = speed;
    }
    public void print(){
        System.out.println("Vin: " +this.getVin()+ ", Max Speed: " + speed.getMax());
    }
}

