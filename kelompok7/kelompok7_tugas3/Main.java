/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle);
        System.out.println("Luas : " + circle.getArea());
        System.out.println("Keliling : " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle);
        System.out.println("Luas : " + rectangle.getArea());
        System.out.println("Keliling : " + rectangle.getPerimeter());
    }
}
