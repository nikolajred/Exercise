package http.developer.alexanderklimov.ru;
import java.util.Scanner;

/**Find the number of tens of a multi-digit number
 * The user enters a three-digit, four-digit, etc. number.
 * Find the number of tens of a given number (second digit on the right).
 */


public class AmountOfTensMulti_digitNumber {

    public static void main(String[] args) {
        searchAmountOfTensMulti_digitNumber();
    }

    public static int inputNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number which is: ");
        int number = scn.nextInt();
        return number;
    }

    public static int searchAmountOfTensMulti_digitNumber() {
        int number = inputNumber();
        int amountOfTens = number%100/10;
        System.out.println("Amount of tens is: " + amountOfTens);
        return amountOfTens;
    }
}
