package part01.chapter05;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + " ");
        }

        for (int j = 0; j < 100; j++) {
//            Условие содержит ошибку
//            if (j == 10) break one;
            System.out.print(j + " ");
        }
    }
}
