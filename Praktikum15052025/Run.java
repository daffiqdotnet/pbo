/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum15052025;

import java.util.Scanner;
public class Run {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("1. Kendaraan\n2. Mobil\n3. Sepeda\n4. Truk\n5. Taksi\n6. Sepeda Listrik");
            System.out.print("Pilihan: ");
            int input;
            input = in.nextInt();
            in.nextLine();
            
            int wheel;
            String color;
            System.out.print("Jumlah Roda: ");
            wheel = in.nextInt();
            System.out.print("Warna: ");
            color = in.nextLine();
            
            if(input == 1){
                Kendaraan A = new Kendaraan(wheel, color);
                A.display();
            } 
            else if (input == 2 || input == 4 || input == 5){
                String fuel;
                int caps;
                
                System.out.print("Bahan Bakar: ");
                fuel = in.nextLine();
                System.out.print("Kapasitas Mesin: ");
                caps = in.nextInt();
                in.nextLine();
                
                if(input == 2){
                    Kendaraan B = new Mobil(wheel, color, fuel, caps);
                    B.display();
                }
                else if(input == 4){
                    int load;
                    
                    System.out.print("Muatan Maksimum: ");
                    load = in.nextInt();
                    in.nextLine();
                    
                    Kendaraan C = new Truk(wheel, color, fuel, caps, load);
                    C.display();
                }
                else {
                    int initTarrif, lengthTarrif;
                    
                    System.out.print("Tarif Awal: ");
                    initTarrif = in.nextInt();
                    in.nextLine();
                    System.out.print("Tarif Per KM: ");
                    lengthTarrif = in.nextInt();
                    in.nextLine();
                    
                    Kendaraan D = new Taksi(wheel, color, fuel, caps, initTarrif, lengthTarrif);
                    D.display();
                }
            }
            else if(input == 3 || input == 6){
                String sadel;
                int gear;
                
                System.out.print("Jumlah Sadel: ");
                sadel = in.nextLine();
                System.out.print("Jumlah Gir: ");
                gear = in.nextInt();
                in.nextLine();
                
                if(input == 3){
                    Kendaraan E = new Sepeda(wheel, color, sadel, gear);
                    E.display();
                }
                else{
                    int maxSpeed, maxLength;
                    
                    System.out.print("Kecepatan Maksimum: ");
                    maxSpeed = in.nextInt();
                    in.nextLine();
                    System.out.print("Jarak Tempuh: ");
                    maxLength = in.nextInt();
                    in.nextLine();
                    
                    Kendaraan F = new Sepeda_Listrik(wheel, color, sadel, gear, maxSpeed, maxLength);
                    F.display();
                }
            }
        }
    }
}
