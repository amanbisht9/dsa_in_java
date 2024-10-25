package main.java.dsa_in_java.BasicDataStructures;


public class Arrays {

    public static void main(String[] args) {

        /*
        Let's say you want to store the ages of five people. 
        Instead of creating five separate variables, you can create an array 
        to store all five values.
        */

        //Declare an array of size 5
        int[] ages = new int[5];

        //Storing the data in an array
        ages[0] = 11;
        ages[1] = 12;
        ages[2] = 14;
        ages[3] = 16;
        ages[4] = 10;

        //Accessing the array stored values
        for(int i = 0; i < ages.length; i++){
            System.out.println("Person age: "+ ages[i]);
        }
        
    }
}
