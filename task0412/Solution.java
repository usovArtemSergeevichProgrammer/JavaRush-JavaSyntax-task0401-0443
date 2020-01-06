package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        System.out.println(resNumber(num));
    }

    public static int resNumber(int num){
        if (num > 0){
            return num * 2;
        } else if (num < 0){
            return num + 1;
        } else {
            return 0;
        }
    }

}