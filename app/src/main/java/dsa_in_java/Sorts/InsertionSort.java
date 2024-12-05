package dsa_in_java.Sorts;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                arr[j] = key;
                j = j - 1;
            }
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr = {3,2,10,5,7,1,9,8,11};
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Perform Insertion Sort
        insertionSort(arr);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
