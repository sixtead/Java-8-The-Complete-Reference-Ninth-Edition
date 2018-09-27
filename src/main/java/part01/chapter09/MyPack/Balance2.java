package part01.chapter09.MyPack;

public class Balance2 {
    String name;
    double bal;

    public Balance2(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.println("-->");
        }
        System.out.println(name + ": $" + bal);
    }
}
