package dsa_in_java.Sorts;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,10,5,7,1,9,8,11};
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Perform Bubble Sort
        bubbleSort(arr);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
        
}
