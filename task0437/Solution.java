package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int number = 8;
        int count = 1;
        for (int i = 1; i <= 10; i++){
            for(int k = 1; k <= count;k++){
                System.out.print(number);
            }
            System.out.println();
            if(count != 10){
            count++;}
        }
    }
}
