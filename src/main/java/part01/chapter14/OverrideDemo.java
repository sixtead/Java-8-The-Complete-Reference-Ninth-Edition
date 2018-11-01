package part01.chapter14;

class Gen8<T> {
    T ob;

    Gen8(T o) {
        ob = o;
    }

    T getob() {
        System.out.print("Метод getob() из класса Gen8: ");
        return ob;
    }
}

class Gen9<T> extends Gen8<T> {
    Gen9(T o) {
        super(o);
    }

    T getob() {
        System.out.print("Метод getob() из класса Gen9: ");
        return ob;
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Gen8<Integer> iOb = new Gen8<Integer>(88);
        Gen9<Integer> iOb2 = new Gen9<Integer>(99);
        Gen9<String> strOb2 = new Gen9<String>("Тест обощений");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
