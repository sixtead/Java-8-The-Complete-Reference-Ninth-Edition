package part01.chapter09.p2;

class OtherPackage {
    OtherPackage() {
        part01.chapter09.p1.Protection p = new part01.chapter09.p1.Protection();
        System.out.println("Конструктор из другого пакета");
//        System.out.println("n = " + p.n);
//        System.out.println("n = " + p.n_pri);
//        System.out.println("n = " + p.n_pro);
        System.out.println("n = " + p.n_pub);
    }
}
