package part01.chapter07;

class Outer3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner3 {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner3 inner = new Inner3();
            inner.display();
        }
    }
}

public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
