/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Quiz24042025;

public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder(){
        
    }
    
    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getVolume(){
        return Math.PI * super.getR() * super.getR() * tinggi;
    }
    
    @Override
    public String toString(){
        return "Informasi Silinder\nRadius: " + super.getR() +
                "\nTinggi: " + tinggi +
                "\nVolume: " + getVolume() +
                "\nLuas Selimut: " + getLuas();
    }
    
    @Override
    public double getLuas(){
        return 2 * Math.PI * super.getR() * tinggi;
    }
}
