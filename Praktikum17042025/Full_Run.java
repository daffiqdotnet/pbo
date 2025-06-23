/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum17042025;

import java.util.Scanner;
public class Full_Run {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Plane[] planeList = new Plane[100];
        int i = 0;
        
        while(true){
            // Menu Selection
            int choice;
            System.out.println("----------Administrator Menu----------\n1. Add Plane\n2. Display Database\n3. Access Passenger Menu\n4. Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();
            in.nextLine();
            
            if(choice == 1){
                // Add New Plane
                String name;
                int year, load;
                boolean machine;
                
                System.out.print("Name of Plane: ");
                name = in.nextLine();
                System.out.print("Production Year: ");
                year = in.nextInt();
                System.out.print("Machinery: ");
                machine = in.nextBoolean();
                System.out.print("Load: ");
                load = in.nextInt();
                
                planeList[i] = new Plane(name, year, machine, load);
                i++;
            }
            else if(choice == 2){
                for(int j = 0; j <= i; j++){
                    System.out.println("====================");
                    planeList[i].print();
                }
            }
            else if(choice == 3){
                while(true){
                    int options;
                    System.out.println("----------Passenger Menu----------\n1. Display Total Plane\n2. Display Load List\n3. Display Age List\n4. Exit");
                    System.out.print("Choice: ");
                    options = in.nextInt();
                    
                    if(options == 1){
                        System.out.println("There are " + i + " plane(s) in total");
                    }
                    else if(options == 2){
                        int max = planeList[0].getLoad();
                        int min = planeList[0].getLoad();
                        int imin = 0, imax = 0;
                        
                        for(int j = 0; j < i; j++){
                            if(max < planeList[j].getLoad()){
                                max = planeList[j].getLoad();
                                imax = j;
                            }
                            
                            if(min > planeList[j].getLoad()){
                                min = planeList[j].getLoad();
                                imin = j;
                            }
                        }
                        
                        System.out.println("Highest Load: " + planeList[imax].getName() + " - " + max);
                        System.out.println("Lowest Load: " + planeList[imin].getName() + " - " + min);
                    }
                    else if(options == 3){
                        for(int j = 0; j < i; j++){
                            for(int k = 1; k < i; k++){
                                if(planeList[j].getProdYear() < planeList[k].getProdYear()){
                                    Plane temp = planeList[j];
                                    planeList[j] = planeList[k];
                                    planeList[k] = temp;
                                }
                            }
                        }
                        
                        for(int j = 0; j < i; j++){
                            System.out.println(planeList[j].getName() + " - " + planeList[j].getProdYear());
                        }
                    }
                    else if(options == 4){
                        System.out.println("Exiting program...");
                        break;
                    }
                    else{
                        System.out.println("There's no such options");
                    }
                }
                break;
            }
            else if(choice == 4){
                System.out.println("Exiting program...");
                break;
            }
            else{
                System.out.println("There's no such options");
            }
        }
    }
}
