/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKM;
    
    public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKM){
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKM = tarifPerKM;
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKM(int tarifPerKM){
        this.tarifPerKM = tarifPerKM;
    }
    
    public int getTarifPerKM(){
        return tarifPerKM;
    }
    
    @Override
    public String display(){
        return super.jmlRoda + " | " + super.warna + " | " + super.bahanBakar + " | " + super.kapasitasMesin + " | " + tarifAwal + " | " + tarifPerKM;
    }
}
