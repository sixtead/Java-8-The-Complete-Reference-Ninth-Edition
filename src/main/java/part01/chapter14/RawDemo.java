package part01.chapter14;

class Gen2<T> {
    T ob;

    Gen2(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}


public class RawDemo {
    public static void main(String[] args) {
        Gen2<Integer> iOb = new Gen2<Integer>(88);
        Gen2<String> strOb = new Gen2<String>("Тест обобщений");
        Gen2 raw = new Gen2(new Double(98.6));

        double d = (Double) raw.getob();
        System.out.println("Значение: " + d);

//        int i = (Integer) raw.getob();

        strOb = raw;
//        String str = strOb.getob();

        raw = iOb;
//        d = (Double) raw.getob();
    }
}
