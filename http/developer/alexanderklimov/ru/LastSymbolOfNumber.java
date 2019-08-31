package http.developer.alexanderklimov.ru;

import java.util.Scanner;

public class LastSymbolOfNumber {
   public static int yourNumber;
   public static char lastSymbolOfYourNumber;

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Input your number: ");

        if (scn.hasNextInt()){
            yourNumber = scn.nextInt();
        }else{
            while(!scn.hasNextInt()){
                System.out.println("Your number is not number: ");
                System.out.println("Input your number: ");
                scn.nextLine();
            }
        }


    }


}
