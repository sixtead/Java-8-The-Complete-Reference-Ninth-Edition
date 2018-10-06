package part01.chapter12;

enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 ap;

        System.out.println("Константы перечислимого типа Apple:");

        for (Apple2 a : Apple2.values()) {
            System.out.println(a);
        }

        System.out.println();

        ap = Apple2.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}
