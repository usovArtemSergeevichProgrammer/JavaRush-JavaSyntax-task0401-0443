package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1 >= num2 && num1 >= num3){
            sorting(num1 ,num2, num3);
        } else if(num2 >= num1 && num2 >= num3){
            sorting(num2, num1, num3);
        } else{
            sorting(num3, num2, num1);
        }


    }

    public static void sorting(int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3){
            if (num2 >= num3){
                System.out.println(num1 + " " + num2 + " " + num3);
            } else{
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }
    }
}
