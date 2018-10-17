package part01.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = -7;
        double d = 4.5e-7;

        pw.println("Это строка");
        pw.println(i);
        pw.println(d);
    }
}
