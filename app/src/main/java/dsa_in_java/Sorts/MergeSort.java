package dsa_in_java.Sorts;

import java.util.Arrays;

public class MergeSort {

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left, right);
    }
        
        
    private static int[] mergeArray(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newArr = new int[first.length+second.length];

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                newArr[k] = first[i];
                i++;
            }else{
                newArr[k] = second[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            newArr[k] = first[i];
            k++;
            i++;
        }

        while (j<second.length) {
            newArr[k] = second[j];
            j++;
            k++;
        }

        return newArr;
    }
        
        
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        arr = mergeSort(arr);
        
        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
