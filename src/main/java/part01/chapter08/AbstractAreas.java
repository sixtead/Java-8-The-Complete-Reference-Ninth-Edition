package part01.chapter08;

abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectabgle2 extends Figure2 {
    Rectabgle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
//        Figure2 f = new Figure2();
        Rectabgle2 r = new Rectabgle2(9, 5);
        Triangle2 t = new Triangle2(10, 8);
        Figure2 figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
