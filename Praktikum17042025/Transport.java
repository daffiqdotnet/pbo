/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum17042025;

public class Transport {
    public String name;
    public int prodYear;
    
    public Transport(){
        name = "Default";
        prodYear = 2000;
    }
    
    public Transport(String name, int prodYear){
        this.name = name;
        this.prodYear = prodYear;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getProdYear(){
        return prodYear;
    }
    
    public void setProdYear(int year){
        this.prodYear = year;
    }
    
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Production Year: " + prodYear);
    }
}
