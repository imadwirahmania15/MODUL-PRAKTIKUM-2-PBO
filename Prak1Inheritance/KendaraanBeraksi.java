/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak1Inheritance;

/**
 *
 * @author imadw
 */
public class KendaraanBeraksi {
    public static void main (String [] args){
        MobilSport ms = new MobilSport();
        ms.merk = "Ferrari";
        ms.tahun = 2020;
        ms.jalan();
        ms.klakson();
        ms.turbo();
    }
}
