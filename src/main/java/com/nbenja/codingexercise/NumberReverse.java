package com.nbenja.codingexercise;

/**
 *
 */
public class NumberReverse {

    public static void main(String[] args) {
        System.out.println(reverse(-101));
    }

    public static int reverse(int input) {
        int counter =1 ;
        int output= 0;
        int absValue = Math.abs(input);
        while(absValue>0) {
            int temp = absValue / 10;
            int result = absValue - temp*10;
            output = output*counter + result;
            counter =10;
            absValue = temp;
        }
        return output;
    }
}
