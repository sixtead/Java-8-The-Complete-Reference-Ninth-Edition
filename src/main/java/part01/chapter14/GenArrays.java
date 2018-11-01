package part01.chapter14;

class Gen12<T extends Number> {
    T ob;
    T[] vals;

    Gen12(T o, T[] nums) {
        ob = o;
//        vals = new T[10];
        vals = nums;
    }
}

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen12<Integer> iOb = new Gen12<Integer>(50, n);

//        Gen12<Integer> gens[] = new Gen12<Integer>[10];

        Gen12<?> gens[] = new Gen12<?>[10];
    }
}
