package Lesson2;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {

        int[] arrays = {2,5,3,8,14,67,1,4};
        for (int i=0; i< arrays.length; i++) {
            Arrays.sort(arrays);
        }

        System.out.println(arrays[0]);
        System.out.println(arrays[7]);
    }
}
