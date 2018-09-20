package part01.chapter08;

class A6 {
    void callme() {
        System.out.println("В методе callme() из класса A");
    }
}

class B6 extends A6 {
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C6 extends A6 {
    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6();
        B6 b = new B6();
        C6 c = new C6();

        A6 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
