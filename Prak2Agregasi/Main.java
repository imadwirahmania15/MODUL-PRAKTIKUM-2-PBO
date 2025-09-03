/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2Agregasi;

/**
 *
 * @author imadw
 */
class KomponenMobil {
    String namaKomponen;
    
    public KomponenMobil (String namaKomponen){
        this.namaKomponen = namaKomponen;
    }
    public void tampilanInfo(){
        System.out.println("Komponen: " + namaKomponen);
    }
}
//Subclass Mesin yang mewarisi KomponenMobil
class Mesin extends KomponenMobil {
    public Mesin (String namaMesin){
        super(namaMesin);
    }     

public void nyalakanMesin(){
    System.out.println(namaKomponen +  " nyalakan.");
   }
}
//Subclass Baterai yang mewarisi KomponenMobil
class Baterai extends KomponenMobil {
    public Baterai(String namaBaterai){
        super (namaBaterai);
    }
    public void cekBaterai(){
        System.out.println(namaKomponen + " diperiksa.");
    }
}
//Kelas Mobil yang memiliki objek Mesin dan Baterai (agregasi)
class Mobil {
    private Mesin mesin;
    private Baterai baterai;
    
    public Mobil(Mesin mesin, Baterai baterai){
        this.mesin = mesin;
        this.baterai = baterai;
    }
    public void mulaiJalan(){
        System.out.println("Mobil mulai berjalan...");
        mesin.nyalakanMesin();
        baterai.cekBaterai();
    }
}
//Kelas utama untuk menjalankan program
public class Main {
    public static void main(String []args){
        //Membuat objek Mesin dan Baterai
        Mesin mesin = new Mesin ("Mesin V8");
        Baterai baterai = new Baterai ("Baterai Lithium-ion");
        
        //Membuat objek Mobil yang memiliki Mesin dan Baterai (Agregasi)
        Mobil mobil = new Mobil (mesin, baterai);
        
        //Memulai Mobil
        mobil.mulaiJalan();
    }
    
}
