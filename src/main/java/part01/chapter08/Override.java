package part01.chapter08;

class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        subOb.show("Это k: ");
        subOb.show();
    }
}
