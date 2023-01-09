package hackerrank;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = 0;
        do {
            //System.out.print(arr[i] + " ");//0=1 1=2 2=3
            i++;
        } while (i < arr.length - 1);
        System.out.print(arr[i] + " ");//3<3 false loop kirirldigi andaki indexi de yazdirir
    }
}