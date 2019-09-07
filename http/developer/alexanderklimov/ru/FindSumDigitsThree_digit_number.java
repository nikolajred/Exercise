package http.developer.alexanderklimov.ru;

import java.util.Scanner;
/**Find the sum of the digits of a three-digit number
 * The user enters a three-digit number. Find the sum of the digits of this number.
*/
public class FindSumDigitsThree_digit_number {
    public static void main(String[] args) {
        searchSum();

    }

    public static int inicialisationVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int var = scanner.nextInt();
        System.out.println("Thank you, your number is " + var);
        return var;
    }

    public static int searchSum() {
        int var = inicialisationVariable();
        int a = var / 100;
        int b = (var - a * 100) / 10;
        int c = var % 10;
        int sum = a+b+c;
        System.out.println("Sum of digits of the three digit number equils: \n" + sum);
        return sum;
    }
}
