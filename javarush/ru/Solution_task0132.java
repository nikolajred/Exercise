package javarush.ru;
/*
Сумма цифр трехзначного числа
*/
public class Solution_task0132 {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int x = number;
        int a = (x / 100);
        int b = (x - (a * 100)) / 10;
        int c = x - (a * 100) - (b*10);
        int d = a + b + c;
        return d;
    }
}