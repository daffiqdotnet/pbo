/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

public class Sepeda_Listrik extends Sepeda {
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public Sepeda_Listrik(int jmlRoda, String warna, String jmlSadel, int jmlGir, int kecepatanMaks, int jarakTempuh){
        super(jmlRoda, warna, jmlSadel, jmlGir);
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }
    
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + super.jmlSadel + " | " + super.jmlGir + " | " + kecepatanMaks + " | " + jarakTempuh; 
    }
}
