package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(bufferedReader.readLine());
        System.out.println(color(num % 5));
    }

    public static String color(double num){
        if (num < 3){
            return "зелёный";
        } else if (num >= 3 && num < 4){
            return "жёлтый";
        } else {
            return "красный";
        }
    }
}