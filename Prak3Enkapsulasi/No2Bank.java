 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak3Enkapsulasi;

/**
 *
 * @author imadw
 */
public class No2Bank {
    //dibuat private agar tidak banyak orang yang bisa akses
    private String noRek;
    private double saldo;
    
    //objek rekenening costructor
    public No2Bank(String noRek, double saldoAwal){
        this.noRek = noRek;
        this.saldo =saldoAwal;
        
    }
    
    //Getter (asessor) menampilkan noRek dengan aman
    public String getnoRek(){
        return "****" + noRek.substring(noRek.length() - 4);
    }
    //Getter (Asessor) cek saldo
    public double getSaldo(){
        return saldo;
    }
        // Setter: tambah saldo (deposit)
     public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
     }
   }     
        
    //Setter (mutator) tarik saldo (withdraw) dengan validasi
    public void tarik(double jumlah){
        if (jumlah > 0 && jumlah <= saldo){
            saldo -= jumlah;     
       } else {
            System.out.println("Saldo tidak cukup!");
        }
        
     }
    public static void main(String []args){
        //membuat rekening baru
        No2Bank account = new No2Bank ("88888888", 500000);
        
        //menampilkan noRek dengan aman 
        System.out.println("Nomor Rekening: " + account.getnoRek());
        
        //saldo awal
        System.out.println("Saldo Awal: " + account.getSaldo());
        
        //deposit uang
        account.deposit(200000);
        System.out.println("Saldo setelah deposit: " + account.getSaldo());
        
        //tarik
        account.tarik(100000);
        System.out.println("Saldo setelah tarik: " + account.getSaldo());
    } 
}
