package part01.chapter05;

class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("такт "  + n);
            n--;
        } while(n > 0);
    }
}