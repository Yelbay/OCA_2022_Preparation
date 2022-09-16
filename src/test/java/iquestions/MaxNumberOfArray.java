package iquestions;

import java.util.Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] nums = {1 ,4 ,7 ,9 ,3 ,56 ,3 };
        int max= 0 ;
        for (int i = 0 ; i <nums.length ; i++) {
            if (nums[i]>max)
                max=nums[i];
            }
        System.out.println(max);
//Write a return method that can sort an int array in Ascending order without using the sort
//method ofthe Arrays class:
        int[] arr = {9,4,23,6,78,4};
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println(arr[1]);
            for (int j = 0 ; j < arr.length ; j++) {
                System.out.println(arr[j]);
                int temp= 0 ;
                if (arr[i]< arr[j]){ // if I change ‘<’ to ‘>’ it will sort from bigger to smaller
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    }

