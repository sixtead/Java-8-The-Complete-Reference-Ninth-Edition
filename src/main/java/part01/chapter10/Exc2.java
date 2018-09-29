package part01.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль.");
        }
        System.out.println("После оператора catch.");
    }
}
