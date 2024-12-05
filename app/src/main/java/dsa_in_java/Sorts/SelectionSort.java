package dsa_in_java.Sorts;

public class SelectionSort {


    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int minVal = arr[i];
            int minIndex = i;
            for(int j = i; j < n; j++){
                if(minVal>arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();

        selectionSort(arr);
        
        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
    
}
