package part01.chapter07;

class Outer2 {
    int outer_x = 100;

    void test() {
        Inner2 inner = new Inner2();
        inner.display();
    }

    class Inner2 {
        int y = 10;

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

    void showy() {
//        System.out.println(y);
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
