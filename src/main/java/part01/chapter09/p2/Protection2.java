package part01.chapter09.p2;

class Protection2 extends part01.chapter09.p1.Protection {
    public Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");
//        System.out.println("n = " + n);
//        System.out.println("n = " + n_pri);
        System.out.println("n = " + n_pro);
        System.out.println("n = " + n_pub);
    }
}
