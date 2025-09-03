/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak1Inheritance;

/**
 *
 * @author imadw
 */

//Superclass
public class Kendaraan {
    
    String merk;
    int tahun;
    
    void jalan(){
        System.out.println(merk + " Berjalan di jalan raya");
    }   
}

//Subclass Mobil 
class Mobil extends Kendaraan{ 
    void klakson(){
        System.out.println("Mobil membunyikan klakson");
    }
}
// Subclass dari mobil
class MobilSport extends Mobil {
    void turbo(){
        System.out.println("Mobil Sport mengaktifkan turbo");
    }
}
