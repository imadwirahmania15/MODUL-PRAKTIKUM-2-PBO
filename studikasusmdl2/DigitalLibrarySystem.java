/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasusmdl2;

/**
 *
 * @author imadw
 */

// Sistem Manajemen Perpustakaan Digital
import java.util.*;

// Superclass User (Encapsulation) 
class User {
    private String userID;   // dienkapsulasi
    private String password; // dienkapsulasi
    private String name;
    
    //constructor
    public User(String userID, String password, String name) {
        this.userID = userID;
        this.password = password;
        this.name = name;
 
    }
      
    //getter dan setter
    public String getUserID() { 
        return userID;
    }
    public void setUserID(String userID) { 
        this.userID = userID;
    }

    public String getPassword() { 
        return password;
    }
    public void setPassword(String password) { 
        this.password = password;    
    }
    public String getName(){
    return name;
    }
}

//Subclass Student (Inheritance)  
//Student mewarisi User
class Student extends User {
   private String studentID;
   
    public Student(String userID, String password, String name, String studentID) {
        super(userID, password, name);
        this.studentID = studentID;
    }
    public String getStudentId (){
        return studentID;
    }
}

//  Subclass Librarian (Inheritance) 
// Librarian mewarisi user
class Librarian extends User {
    private String staffID;

    public Librarian(String userID, String password, String name,  String staffID) {
        super(userID, password, name);
        this.staffID = staffID;
    }

    public String getStaffID() { 
        return staffID; }

    public void manage() {
        System.out.println("Librarian managing the library system.");
    }
}

// ENCAPSULATION
// Superclass Material 

class Material {
    private String materialID;
    private String title;
    private String author;
    private String dueDate; // dienkapsulai
   

    public Material(String materialID, String title, String author, String dueDate) {
        this.materialID = materialID;
        this.title = title;
        this.author = author;
        this.dueDate = dueDate;
    }
    public String getMaterialID () { 
        return materialID; 
    }
    public String getTitle() { 
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getDueDate() { 
        return dueDate;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    
}
//inheritance
//Subclass Book 
//Book mewarisi material
class Book extends Material { 
    private String isbn;
    private int pages;

    public Book(String materialID, String title, String author, String isbn, int pages) {
        super(materialID, title, author, null); // dueDate default null
        this.isbn = isbn;
        this.pages = pages;
    }

    public String getIsbn() { 
        return isbn;
    }
    public int getPages() { 
        return pages;
    }
    
}

// Subclass Journal 
//Journal mewarisi material
class Journal extends Material {
    private String issn;
    private int volume;

    public Journal(String materialID, String title, String author, String issn, int volume) {
        super(materialID, title, author, null);
        this.issn = issn;
        this.volume = volume;
    }

    public String getIssn() { 
        return issn;
    }
    public int getVolume() { 
        return volume;
    }
}

// Aggregation: Library memiliki banyak User & Material 
class Library {
    private List<User> users = new ArrayList<>();
    private List<Material> materials = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void showLibraryData() {
        System.out.println("=== Users in Library ===");
        for (User u : users) {
            System.out.println("- " + u.getUserID() + " : " + u.getName());
        }
    }

    public void showMaterials() {
        System.out.println("\n=== Materials in Library ===");
        for (Material m : materials) {
            System.out.println("- " + m.getTitle() + " by " + m.getAuthor());
        }
    }
}

//  Aggregation: BorrowTransaction menghubungkan User dan Material 
class BorrowTransaction {
    private User user;
    private Material material;
    private Date dueDate;  // dienkapsulasi

    public BorrowTransaction(User user, Material material, Date dueDate) {
        this.user = user;
        this.material = material;
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public void showTransaction() {
        System.out.println("\n=== Borrow Transaction ===");
          System.out.println("User: " + user.getUserID() + " : " + user.getName());
          System.out.println("Material: " + material.getMaterialID()+ " : " + material.getTitle());
          System.out.println("Due on: " + dueDate);
    }
}

//  Main Program 
public class DigitalLibrarySystem {
    public static void main(String[] args) {
        
        // Buat User
        Student s1 = new Student("S001", "pass123", "Mimoy", "S321");
        Librarian l1 = new Librarian("L001", "lib321", "Kuseno", "l098");

        // Buat Material
        Book b1 = new Book("M01", "Surga dan Neraka", "Gus Abdullah", "ISBN12345", 300);
        Journal j1 = new Journal("M02", "Hacker masa muda", "Mr. F", "ISSN6789", 12);

        // Buat Library
        Library lib = new Library();
        lib.addUser(s1);
        lib.addUser(l1);
        lib.addMaterial(b1);
        lib.addMaterial(j1);

        // Tampilkan isi Library
        lib.showLibraryData();
        lib.showMaterials(); //daftar buku/jurnal

        // Buat BorrowTransaction
        BorrowTransaction t1 = new BorrowTransaction(s1, b1, new Date());
        t1.showTransaction();
    }
}

