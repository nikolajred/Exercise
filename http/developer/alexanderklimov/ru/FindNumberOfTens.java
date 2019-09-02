package http.developer.alexanderklimov.ru;

import java.util.Scanner;

/**
 * Find the number of tens of a two-digit number
 * The user enters a two-digit number. Find the number of tens of a given number.
 */
public class FindNumberOfTens {
    public static void main(String[] args) {
        searchAmountOfTens();
    }

    public static int inputNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number which is < 100: ");
        int number = scn.nextInt();
        if (number >= 100) {
            while (number >= 100) {
                System.out.println("Your number is >= 100");
                System.out.println("Input your number which is < 100: ");
                number = scn.nextInt();
            }
        }
        return number;
    }

    public static int searchAmountOfTens() {
        int number = inputNumber();
        int amountOfTens = (number - number % 10) / 10;
        System.out.println("Amount of tens is: " + amountOfTens);
        return amountOfTens;
    }
}
