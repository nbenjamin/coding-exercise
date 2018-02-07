package com.nbenja.codingexercise;

import java.util.Arrays;

/**
 *
 */
public class ArrayShift {


    public static void arrayShift(String[] array, int count) {

        int j = 0;
        int z =0;
        String[] firstHalf = new String[count];
        String[] result = new String[array.length];
        for (int i = 0; i <array.length; i++) {
            if(i < count) {
                firstHalf[i] = array[i];
            } else {
                result[z] = array[i];
                z++;
            }

        }
        for(int k =0; k <firstHalf.length; k++,z++) {
            result[z] = firstHalf[k];
        }

        System.out.println(Arrays.asList(result));

    }

    public static void main(String[] args) {
        String[] input= {"1","2", "3", "4", "5"};
        arrayShift(input, 2);
    }
}
