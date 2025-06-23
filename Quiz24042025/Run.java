/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Quiz24042025;

import java.util.Scanner;
public class Run {
    public static void main(String[] args){
        Scanner sheesh = new Scanner(System.in);
        int opt;
        
        while(true){
            System.out.println("==========MENU==========\n1. Lingkaran\n2. Kerucut\n3. Silinder\n4. Keluar");
            System.out.print("Pilihan: ");
            opt = sheesh.nextInt();
            
            if(opt == 1){
                double radius;
                System.out.print("Radius lingkaran: ");
                radius = sheesh.nextInt();
                
                Lingkaran shape = new Lingkaran(radius);
                System.out.println(shape.toString());
            }
            else if(opt == 2){
                double radius, tinggi;
                System.out.print("Radius kerucut: ");
                radius = sheesh.nextInt();
                System.out.print("Tinggi kerucut: ");
                tinggi = sheesh.nextInt();
                
                Kerucut shape = new Kerucut(radius, tinggi);
                System.out.println(shape.toString());
            }
            else if(opt == 3){
                double radius, tinggi;
                System.out.print("Radius silinder: ");
                radius = sheesh.nextInt();
                System.out.print("Tinggi silinder: ");
                tinggi = sheesh.nextInt();
                
                Silinder shape = new Silinder(radius, tinggi);
                System.out.println(shape.toString());
            }
            else if(opt == 4){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Error Input!");
            }
        }
    }
}
