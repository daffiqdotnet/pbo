/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Quiz24042025;

public class Lingkaran {
    private double r;
    
    public Lingkaran(){
        
    }
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    public void setR(double r){
        this.r = r;
    }
    
    public double getR(){
        return r;
    }
    
    public double getDiameter(){
        return r * 2;
    }
    
    public double getKeliling(){
        return 2 * Math.PI * r;
    }
    
    public double getLuas(){
        return Math.PI * r * r;
    }
    
    @Override
    public String toString(){
        return "Informasi Lingkaran\nRadius: " + r +
                "\nDiameter: " + getDiameter() +
                "\nKeliling: " + getKeliling() +
                "\nLuas: " + getLuas();
    }
}
