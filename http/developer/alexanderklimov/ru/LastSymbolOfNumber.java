package http.developer.alexanderklimov.ru;

import java.util.Scanner;

public class LastSymbolOfNumber {
   public static long yourNumber;
   public static char lastSymbolOfYourNumber;

    public static void main(String[] args) {

        createYourNumber();
        searchLastSymbolOfYourNumber();

    }

    public static long createYourNumber(){
        Scanner scn =new Scanner(System.in);
        System.out.println("Input your number: ");

        if (scn.hasNextLong()){
            yourNumber = scn.nextLong();
            return yourNumber;
        }else{
            while(!scn.hasNextLong()){
                System.out.println("Your number is not number: ");
                System.out.println("Input your number: ");
                scn.nextLine();
            }
        }return yourNumber;
    }
    public static char searchLastSymbolOfYourNumber(){
        String yourNumberToString = Long.toString(yourNumber);
        StringBuilder stringBuilder = new StringBuilder(yourNumberToString);
        lastSymbolOfYourNumber = stringBuilder.charAt(stringBuilder.length()-1);
        System.out.println("last symbol of your number is: " + lastSymbolOfYourNumber);
        return lastSymbolOfYourNumber;
    }


}
