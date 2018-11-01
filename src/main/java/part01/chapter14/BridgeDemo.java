package part01.chapter14;

class Gen10<T> {
    T ob;

    Gen10(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen11 extends Gen10<String> {
    Gen11(String o) {
        super(o);
    }

    String getob() {
        System.out.println("Вызван метод String getob(): ");
        return ob;
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Gen11 strOb2 = new Gen11("Тест обобщений");

        System.out.println(strOb2.getob());
    }
}
