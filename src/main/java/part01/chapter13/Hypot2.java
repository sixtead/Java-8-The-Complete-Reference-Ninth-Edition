package part01.chapter13;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Hypot2 {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("При заданной длине сторон " + side1 + " и " + side2 + " гиротенуза равна " + hypot);
    }
}
