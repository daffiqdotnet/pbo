/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum31052025;

public class BRI extends Bank implements BRIBehavior {
    private int interest;
    
    public BRI(String name){
        super(name);
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
    
    @Override
    public void eduSaving(boolean edu){
        if(edu){
            this.interest = 0;
        }
    }
    
    @Override
    public void regSaving(boolean reg){
        if(reg){
            this.interest = 2000;
        }
    }
    
    @Override
    public int transferFee(){
        return 2500;
    }
    
    @Override
    public String virtualAccount(){
        return "224225227";
    }
    
}
