package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        int oX = sc.nextInt();
        int oY = sc.nextInt();

        if(oX > 0 && oY > 0){
            System.out.println("1");
        } else if(oX < 0 && oY > 0){
            System.out.println("2");
        } else if(oX < 0 && oY < 0){
            System.out.println("3");
        } else if(oX > 0 && oY < 0){
            System.out.println("4");
        }

    }
}
