package dsa_in_java.SeachingAlgorithms;

public class BinarySearch {


    public static int binarySearch(int[] arr, int value){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left+right/2;
            if(arr[mid]==value){
                return mid;
            }
            if(arr[mid] > value){
                right = mid-1;
            }
            if(arr[mid] < value){
                left = mid+1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int target){
        if(left<=right){
            int mid = left+right/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]>target){
                return recursiveBinarySearch(arr, left, mid-1, target);
            }

            if(arr[mid]<target){
                return recursiveBinarySearch(arr, mid+1, right, target);
            }
        }

        return -1;
    }





    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        //without recursion
        //int index = binarySearch(arr,2);

        //with recursion
        int index = recursiveBinarySearch(arr, 0, arr.length-1, 8);
        if(index == -1){
            System.out.println("Index not found.");
        }else{
            System.out.println("Value found at index: "+index);
        }
    }
}
