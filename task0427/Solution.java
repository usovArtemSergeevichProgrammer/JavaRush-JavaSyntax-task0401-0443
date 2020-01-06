package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int number = Integer.parseInt(bufferedReader.readLine());
        String strNumber = String.valueOf(number);
        if(number >= 1 && number <= 999 ) {
            if (number % 2 == 0 && strNumber.length() == 1) {
                System.out.println("четное однозначное число");
            } else if (number % 2 != 0 && strNumber.length() == 1) {
                System.out.println("нечетное однозначное число");
            } else if (number % 2 == 0 && strNumber.length() == 2) {
                System.out.println("четное двузначное число");
            } else if (number % 2 != 0 && strNumber.length() == 2) {
                System.out.println("нечетное двузначное число");
            } else if (number % 2 == 0 && strNumber.length() == 3) {
                System.out.println("четное трехзначное число");
            } else if (number % 2 != 0 && strNumber.length() == 3) {
                System.out.println("нечетное трехзначное число");
            }
        }

    }
}
