/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan(int jmlRoda, String warna){
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }
    
    public void setJmlRoda(int roda){
        jmlRoda = roda;
    }
    
    public int getJmlRoda(){
        return jmlRoda;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public String display(){
        return jmlRoda + " | " + warna;
    }
}
