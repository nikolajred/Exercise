package http.developer.alexanderklimov.ru;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static int count = 0;

    public static void main(String[] args) {
        int gR = generateRandomDigit();
        while (count != 7) {
            int gsR = guessRandomDigit();
            if (gR == gsR) {
                System.out.println("You win, congratulations!!!");
                break;
            } else if (gR > gsR) {
                System.out.println("Your digit is less");
            } else {
                System.out.println("Your digit is more");
            }
            count++;
            if (count == 7) {
                System.out.println("You lost! Go to feed cat:)");
            }
        }
    }

    public static int generateRandomDigit() {
        Random random = new Random();
        int randomDigit;
        randomDigit = random.nextInt(100 + 1);
        //int randomDigit =(int) ((Math.random()*100)/(Math.random()*10));
        //System.out.println(randomDigit);
        return randomDigit;
    }

    public static int guessRandomDigit() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Guess random digit, make input your guess digit: ");
        System.out.println("Left " + (7 - count)+ " attempts");
        int guessDigit = scn.nextInt();
        return guessDigit;

    }
}
