/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
public class MainTest {
    public static void main(String[] args) {
        // Upcast Circle ke Shape
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius()); // ERROR, jadi dihapus atau:
        // System.out.println(((Circle) s1).getRadius()); // Cara benar

        Circle c1 = (Circle) s1; // Downcast kembali ke Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); // ERROR, abstract class tidak bisa di-instantiate
        Shape s2 = new Circle(); // Diganti dengan subclass yang bisa di-instantiate

        // Upcast Rectangle ke Shape
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); // ERROR
        System.out.println(((Rectangle) s3).getLength()); // Cara benar

        Rectangle r1 = (Rectangle) s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        // Upcast Square ke Shape
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide()); // ERROR
        System.out.println(((Square) s4).getSide()); // Cara benar

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide()); // ERROR
        System.out.println(((Square) r2).getSide()); // Cara benar
        System.out.println(r2.getLength());

        // Downcast Rectangle ke Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}