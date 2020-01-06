package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int number = 8;
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
