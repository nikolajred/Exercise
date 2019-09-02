package http.developer.alexanderklimov.ru;


import java.util.Scanner;
/**Find the last digit
 * The user enters an integer. Find the last digit.
*/
 public class FindLastDigit {
    public static void main(String[] args) {
        lastDigitOfNumber();

    }
    public static int inputNumber(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = scn.nextInt();
       return number;
    }
    public static int lastDigitOfNumber(){
        int lastDigit = inputNumber()%10;
        System.out.println("Last digit of yours number is: " + lastDigit);
        return lastDigit;
    }
}
