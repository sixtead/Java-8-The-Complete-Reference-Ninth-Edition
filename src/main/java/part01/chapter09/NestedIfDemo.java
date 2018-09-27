package part01.chapter09;

class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}


public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();

        if (nif.isNotNegative(10)) {
            System.out.println("Число 10 отрицательное");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Это не будет выведено");
        }
    }

}
