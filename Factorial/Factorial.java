package Factorial;

import java.util.Scanner;

public class Factorial {
    static int factor;
    int n;

    Factorial(int n) {
        this.n = n;
    }
    Factorial(){

    }

    public static int searchFactorial(int n) {
        if (n < 2) {
            return 1;
        }
        factor = searchFactorial(n - 1) * n;
        return factor;
    }

    public static void main(String[] args) {
        Factorial fac = new Factorial();
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number n: ");
        fac.n = scn.nextInt();
        System.out.println("Factorial of number " + fac.n + " is " + searchFactorial(fac.n));

    }


}
