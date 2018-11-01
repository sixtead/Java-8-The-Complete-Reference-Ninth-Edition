package part01.chapter14;

class NonGen2 {
    int num;

    NonGen2(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

class Gen5<T> extends NonGen2 {
    T ob;

    Gen5(T o, int i) {
        super(i);
        ob =o;
    }

    T getob() {
        return ob;
    }
}

public class HierDemo2 {
    public static void main(String[] args) {
        Gen5<String> w = new Gen5<String>("Добро пожаловать", 47);

        System.out.print(w.getob() + " ");
        System.out.println(w.getnum());
    }
}
