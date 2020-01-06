package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        int value = 1;

        while (value <= 10){
            int num = 1;
            while (num <= 10){
                System.out.print((num * value) + " ");
                num++;
            }
            System.out.println();
            value++;
        }
    }
}
