/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

public class Sepeda extends Kendaraan {
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(int jmlRoda, String warna, String jmlSadel, int jmlGir){
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    
    public void setJmlSadel(String jmlSadel){
        this.jmlSadel = jmlSadel;
    }
    
    public String getJmlSadel(){
        return jmlSadel;
    }
    
    public void setJmlGir(int jmlGir){
        this.jmlGir = jmlGir;
    }
    
    public int getJmlGir(){
        return jmlGir;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + jmlSadel + " | " + jmlGir;
    }
}
