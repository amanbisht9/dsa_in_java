package dsa_in_java.BasicDataStructures.Hashing;

import java.util.Hashtable;
import java.util.Map;

import org.checkerframework.checker.units.qual.t;

public class HashTableExample {

    // Java provides the Hashtable class, a legacy hash table implementation. 
    // Hashtable is synchronized, making it thread-safe but slightly slower than HashMap. 
    // It doesn’t allow null keys or values, unlike HashMap.

    public static void main(String[] args) {
        Map<Integer, String> hashTable = new Hashtable<>();

        //Adding key value pair in hashTable
        hashTable.put(1, "Aman");
        hashTable.put(2, "Emmie");
        hashTable.put(3, "Alen");
        hashTable.put(4, "Ella");
        hashTable.put(5, "Emma");

        //Display the hashTable
        System.out.println("Display hashTable: "+hashTable);

        //Display second element of hashTable
        System.out.println("Display second element: "+hashTable.get(2));

        //Removing key 2 from hashTable
        hashTable.remove(2);

        //Display the hashTable
        System.out.println("Display hashTable after removing key 2: "+hashTable);

        // Iterating over keys and values
        for (Integer key : hashTable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashTable.get(key));
        }
        
    }
}
