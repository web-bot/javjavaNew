package Lesson2;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        int[] arrays = new int[7];
        int number = 0;
        for (int i=0; i < arrays.length; i++) {
            number += 3;
            arrays[i] = number;

        }
        System.out.println(Arrays.toString(arrays));



    }
}
