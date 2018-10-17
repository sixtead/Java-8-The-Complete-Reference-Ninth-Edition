package part01.chapter13;

public class AssertDemo2 {
    static int val = 3;

    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i < 10; i++) {
            assert (n = getnum()) > 0 : "n отрицательное!";
            System.out.println("n равно " + n);
        }
    }
}
