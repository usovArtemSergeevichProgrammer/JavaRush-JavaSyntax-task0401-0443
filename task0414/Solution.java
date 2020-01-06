package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine());

        System.out.println("количество дней в году: " + day(year));

    }

    public static int day(int year){
        if((year % 400) == 0){
            return 366;
        } else if ((year % 100) == 0){
            return 365;
        } else if ((year % 4) == 0){
            return 366;
        } else {
          return 365;
        }
    }
}