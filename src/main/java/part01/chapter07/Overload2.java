package part01.chapter07;

class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутсвуют");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутреннее преобрпзование при вызове test(double) a: " + a);
    }
}

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}
