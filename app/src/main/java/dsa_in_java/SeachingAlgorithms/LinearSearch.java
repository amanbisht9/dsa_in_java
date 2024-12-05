package dsa_in_java.SeachingAlgorithms;

public class LinearSearch {

    public static int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        int index = linearSearch(arr, 6);

        if(index == -1){
            System.out.println("Value not found.");
        }else{
            System.out.println("Value found at index: "+index);
        }

    }   
}