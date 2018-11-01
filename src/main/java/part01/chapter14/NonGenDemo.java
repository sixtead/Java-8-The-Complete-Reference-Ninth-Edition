package part01.chapter14;

class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getob();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();

        String str = (String) strOb.getob();
        System.out.println("Значение: " + str);

        iOb = strOb;
        v = (Integer) iOb.getob();
    }
}
