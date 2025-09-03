/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak2Agregasi;

/**
 *
 * @author imadw
 */

class buku {
  private String judul;
  private String penulis;
    
    public buku (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    public void tampilkanInfo(int nomor){
        System.out.println(nomor + ". Judul Buku: " + judul);
        System.out.println("   Nama Penulis: " + penulis);       
    }
}

class perpustakaan {
 private  buku[] koleksiBuku;
  
  public perpustakaan (buku[] koleksiBuku){
      this.koleksiBuku = koleksiBuku;    
  }
  public void tampilanPerpus(){
      System.out.println("Daftar buku di Perpustakaan:");  
      int nomor = 1;
      for (buku b: koleksiBuku){
          b.tampilkanInfo(nomor);
          nomor++;
      }
  }     
}
public class BukuBeraksi {
    public static void main (String [] args){
       
    buku B1 = new buku ("cerita rakyat", "Renren Gusti");
    buku B2 = new buku ("Tutorial masak", "Ima Rahma");
    buku B3 = new buku ("Matematika asik", "Ali Mansur");
    
    // Membuat array buku (koleksi)
        buku[] daftarBuku = {B1, B2, B3};
        
        // Membuat Perpustakaan yang memiliki Buku (agregasi)
        perpustakaan perpus = new perpustakaan(daftarBuku);
        
        // Menampilkan isi Perpustakaan
        perpus.tampilanPerpus();
        
     
    }   
}
