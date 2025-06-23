/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum17042025;

public class Plane extends Steam{
    private int load;
    
    public Plane(){
        load = 100;
    }
    
    public Plane(String name, int prodYear, boolean machine, int load){
        super(name, prodYear, machine);
        super.prodYear = prodYear;
        this.load = load;
    }
    
    public int getLoad(){
        return load;
    }
    
    public void setLoad(int load){
        this.load = load;
    }
    
    public void reset(String name, int year, boolean machine, int load){
        setName(name);
        setProdYear(prodYear);
        setMachine(machine);
        setLoad(load);
    }
    
    public String category(int load){
        if(load <= 50){
            return "Light";
        }
        else if(load <= 100){
            return "Medium";
        }
        else{
            return "Heavy";
        }
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Passenger: " + load);
        System.out.println("Classification: " + category(load));
    }
}
