/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

public class Truk extends Mobil {
    protected int muatanMaks;
    
    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks){
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + super.bahanBakar + " | " + super.kapasitasMesin + muatanMaks;
    }
}
