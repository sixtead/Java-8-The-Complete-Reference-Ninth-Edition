package part01.chapter08;

class A4 {
    A4() {
        System.out.println("В конструкторе A.");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("В конструкторе B.");
    }
}

class C4 extends B4 {
    C4() {
        System.out.println("В конструкторе C.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C4 c = new C4();
    }
}
