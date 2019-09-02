package javarush.ru;

import java.io.*;
import java.util.*;

/*
Переходим дорогу вслепую
*/
public class Solution_task0416 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextFloat();
        t = t % 5;

        if (t < 3||t==5)
            System.out.println("зелёный");
        else if (t >= 3 && t < 4)
            System.out.println("жёлтый");
        else if (t >= 4 && t < 5)
            System.out.println("красный");
        Object object = new Object();


    }
}