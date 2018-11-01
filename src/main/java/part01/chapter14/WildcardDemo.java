package part01.chapter14;

class Stats2<T extends Number> {
    T[] nums;

    Stats2(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }

    boolean saveAvg(Stats2<?> ob) {
        if (average() == ob.average()) {
            return true;
        } else {
            return false;
        }
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats2<Integer> iob = new Stats2<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dob = new Stats2<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats2<Float> fob = new Stats2<Float>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

        System.out.print("Средние значения iob и dob ");
        if (iob.saveAvg(dob)) {
            System.out.println("равны.");
        } else {
            System.out.println("отличаются.");
        }

        System.out.print("Средние значения iob и fob ");
        if (iob.saveAvg(fob)) {
            System.out.println("равны.");
        } else {
            System.out.println("отличаются.");
        }
    }
}
