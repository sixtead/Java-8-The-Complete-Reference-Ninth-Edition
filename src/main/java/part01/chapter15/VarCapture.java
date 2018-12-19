package part01.chapter15;

interface MyFunc {
    int dunc(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

//            num++;

            return v;
        };

//        num = 9;
    }
}
