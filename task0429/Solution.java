package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());

        int positive = 0;
        int negative = 0;

        if(number1 != 0){
            if(number1 > 0){
                positive++;
            } else{
                negative++;
            }
        }

        if(number2 != 0){
            if(number2 > 0){
                positive++;
            } else{
                negative++;
            }
        }

        if(number3 != 0){
            if(number3 > 0){
                positive++;
            } else{
                negative++;
            }
        }

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }


}
