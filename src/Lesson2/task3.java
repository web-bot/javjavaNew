package Lesson2;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] arrays = {1,5,3,2,11,4,5,24,8,9,1};
        for (int i=0; i < arrays.length; i++) {
            if (arrays[i] < 6) {
                arrays[i] = arrays[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
