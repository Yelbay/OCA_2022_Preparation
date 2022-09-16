package iquestions;

import java.util.Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] arr = {9, 4, 23, 6, 78, 4};
        int min = arr[0];
        for (int i= 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
       //secondway
        int[] arr1 = {9 ,4 ,23 ,6 ,78 ,4 };
        Arrays.sort(arr1);
        int minNum = arr1[0 ];
        System.out.println(min);
    }


}