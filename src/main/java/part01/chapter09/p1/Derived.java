package part01.chapter09.p1;

class Derived extends Protection {
    public Derived() {
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
