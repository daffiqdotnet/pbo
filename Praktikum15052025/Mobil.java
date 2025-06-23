/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin){
        super(jmlRoda, warna);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + bahanBakar + " | " + kapasitasMesin;
    }
}
