package http.developer.alexanderklimov.ru;


import java.util.Scanner;
/**The increasing order of numbers in the number
 * You need to find out if the numbers in the given number are in ascending order or not
 * (13569 - yes, 132456 - no).
 */
 public class IncreasingOrderOfNumbers {
    public static void main(String[] args) {
        compareIncreasingOrderOfNumbers();

    }

    public static int inicialisationVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int var = scanner.nextInt();
        System.out.println("Thank you, your number is " + var);
        return var;
    }

    public static void compareIncreasingOrderOfNumbers() {
        String var = Integer.toString(inicialisationVariable());
        String[] string = var.split("");
        int i;
        String s = null;
        int MIN = Integer.parseInt(string[0]);
        for (i = 1; i < string.length; i++){
            if (MIN <= Integer.parseInt(string[i])) {
                MIN = Integer.parseInt(string[i]);
                s = " ARE in ascending order";
            } else {
                s =  " ARE NOT in ascending order";
                break;
            }

        }
        System.out.println("The digits in the given number " + var + s);

    }

}
