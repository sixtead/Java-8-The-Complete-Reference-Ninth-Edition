package part01.chapter13;

public class MyClass2 {
    int a;
    int b;

    public MyClass2(int i, int j) {
        a = i;
        b = j;
    }

    public MyClass2(int i) {
        this(i, i);
    }

    public MyClass2() {
        this(0);
    }
}
