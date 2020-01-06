package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
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

        if (number < 0 && number % 2 == 0){
            System.out.println("отрицательное четное число");
        } else if (number < 0 && number % 2 != 0){
            System.out.println("отрицательное нечетное число");
        } else if (number > 0 && number % 2 != 0){
            System.out.println("положительное нечетное число");
        } else if (number > 0 && number % 2 == 0){
            System.out.println("положительное четное число");
        } else{
            System.out.println("ноль");
        }


    }
}
