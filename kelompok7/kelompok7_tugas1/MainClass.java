/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffiqto
 */
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah shape yang ingin dibuat : ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        Shape[] shapes = new Shape[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nShape ke-" + (i + 1));
            System.out.println("Pilih bentuk: \n1. Circle\n2. Rectangle\n3. Square");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan warna : ");
            String color = input.nextLine();

            System.out.print("Apakah shape terisi? (true/false) : ");
            boolean filled = input.nextBoolean();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan radius : ");
                    double radius = input.nextDouble();
                    shapes[i] = new Circle(radius, color, filled);
                    break;
                case 2:
                    System.out.print("Masukkan lebar : ");
                    double width = input.nextDouble();
                    System.out.print("Masukkan panjang : ");
                    double length = input.nextDouble();
                    shapes[i] = new Rectangle(width, length, color, filled);
                    break;
                case 3:
                    System.out.print("Masukkan sisi : ");
                    double side = input.nextDouble();
                    shapes[i] = new Square(side, color, filled);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    i--; 
            }
        }

        System.out.println("\n===== HASIL DATA SHAPE =====");
        for (Shape shape : shapes) {
            System.out.println("---------------------------------");
            System.out.println(shape.toString());
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Luas : " + c.getArea());
                System.out.println("Keliling : " + c.getPerimeter());
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.println("Luas : " + s.getArea());
                System.out.println("Keliling : " + s.getPerimeter());
                System.out.println("Sisi : " + s.getSide());
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println("Luas : " + r.getArea());
                System.out.println("Keliling : " + r.getPerimeter());
                System.out.println("Lebar : " + r.getWidth());
                System.out.println("Panjang : " + r.getLength());
            }
        }

        input.close();
    }
}