package Lesson2;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {

        int[][] arrays = new int[5][5];
        int lastIndex = arrays.length - 1;
        for (int i=0; i<arrays.length; i++) {
            arrays[i][i] = arrays[i][lastIndex - i]=1;
            System.out.println(Arrays.toString(arrays[i]));

        }

    }

}
