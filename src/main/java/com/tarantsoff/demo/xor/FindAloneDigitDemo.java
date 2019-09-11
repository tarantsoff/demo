package com.tarantsoff.demo.xor;

public class FindAloneDigitDemo {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println("xor = " + xor);
    }
}
