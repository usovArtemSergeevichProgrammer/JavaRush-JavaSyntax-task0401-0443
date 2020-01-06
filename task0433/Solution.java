package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        String s = "S";

        int countOutside = 1;

        while (countOutside <= 10){
            int countInside = 1;
            while (countInside <= 10){
                System.out.print(s);
                countInside++;
            }
            System.out.println();
            countOutside++;
        }
    }
}
