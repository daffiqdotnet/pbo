/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum17042025;

public class Steam extends Transport{
    private boolean machine;
    
    public Steam(){
        machine = true;
    }
    
    public Steam(String name, int prodYear, boolean machine){
        super(name, prodYear);
        this.machine = machine;
    }
    
    public boolean getMachine(){
        return machine;
    }
    
    public void setMachine(boolean machine){
        this.machine = machine;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Machinery: " + (machine ? "Yes" : "No"));
    }
}
