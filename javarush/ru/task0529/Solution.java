package javarush.ru.task0529;

/*
Консоль-копилка
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        //System.out.println("wait input symbol: ");
        int c = 0;
        int b = 0;
        while (true) {
            while (in.hasNextInt()) {
                c = in.nextInt();
                b = b + c;
            }
            String s = in.nextLine();

            if (s.equals("сумма")) {
                System.out.println(b);
                break;
            }
        }
    }
}

