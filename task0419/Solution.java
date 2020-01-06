package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int num4 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(maximumOfTwo(maximumOfTwo(num1, num2), maximumOfTwo(num3, num4)));
    }

    public static int maximumOfTwo(int a, int b){
        if(a >= b){
            return a;
        } else{
            return b;
        }
    }

}
