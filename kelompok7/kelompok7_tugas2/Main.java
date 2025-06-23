/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah shape yang ingin dibuat : ");
        int jumlah = input.nextInt();
        input.nextLine();

        Shape[] shapes = new Shape[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nShape ke-" + (i + 1));
            System.out.println("Pilih bentuk:\n1. Circle\n2. Rectangle\n3. Square");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan warna : ");
            String color = input.nextLine();

            System.out.print("Apakah terisi? (true/false) : ");
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
                    System.out.println("Pilihan tidak tersedia, ulangi.");
                    i--;
            }
        }

        System.out.println("\n===== HASIL DATA SHAPE =====");
        for (Shape shape : shapes) {
            System.out.println("---------------------------------");
            System.out.println(shape.toString());
            System.out.println("Luas : " + shape.getArea());
            System.out.println("Keliling : " + shape.getPerimeter());
        }

        input.close();
    }
}