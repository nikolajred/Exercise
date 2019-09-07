package http.developer.alexanderklimov.ru;

import java.util.Scanner;
/**Next even number
 *The user enters an integer.
 *If the number is even, then add 2 to it, and if it is odd, then 1. Do not use the if condition.
 */
public class NextEvenNumber {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static int inicialisationVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int var = scanner.nextInt();
        System.out.println("Thank you, your number is " + var);
        return var;
    }

    public static int compareNumbers() {
        int var = inicialisationVariable();
        var = (var % 2 != 0) ? (var + 1) : (var + 2);
        System.out.println("Next even number is: " + var);
        return var;

    }
}
