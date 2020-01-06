package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String string = bufferedReader.readLine();
        int count = Integer.parseInt(bufferedReader.readLine());

        int i = 1;
        while (i <= count){
            System.out.println(string);
            i++;
        }

    }
}
