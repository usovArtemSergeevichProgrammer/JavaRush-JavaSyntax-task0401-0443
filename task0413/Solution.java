package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int day = Integer.parseInt(bufferedReader.readLine());
        System.out.println(dayOfWeek(day));


    }

    public static String dayOfWeek(int day){
        String res = "такого дня недели не существует";

        if (day == 1){
            res = "понедельник";
        } else if (day == 2){
            res = "вторник";
        } else if (day == 3){
            res = "среда";
        } else if (day == 4){
            res = "четверг";
        } else if (day == 5){
            res = "пятница";
        } else if (day == 6){
            res = "суббота";
        } else if (day == 7){
            res = "воскресенье";
        } else {
            return res;
        }
        return res;
    }
}