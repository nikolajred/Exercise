package Factorial;

public class Factorial{
    static int factor;

    public static void main(String[] args) {
        System.out.println(searchFactoria(10));

    }

    public static int searchFactoria(int n) {
        if (n < 0) {
            return 1;
        }
        factor = searchFactoria(n - 1) * n;
        return factor;
    }
}
