package dsa_in_java.BasicDataStructures.Hashing;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    // If you need a hash table that preserves insertion order, LinkedHashMap 
    // extends HashMap but maintains an internal doubly linked list to track 
    // the order of entries. This is useful when order matters in retrieval.


    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //Adding key value pair in linkedHashMap
        linkedHashMap.put(1, "Aman");
        linkedHashMap.put(2, "Emmie");
        linkedHashMap.put(3, "Alen");
        linkedHashMap.put(4, "Ella");
        linkedHashMap.put(5, "Emma");

        //Display the hashTable
        System.out.println("Display hashTable: "+linkedHashMap);

        //Display second element of linkedHashMap
        System.out.println("Display second element: "+linkedHashMap.get(2));

        //Removing key 2 from linkedHashMap
        linkedHashMap.remove(2);

        //Display the linkedHashMap
        System.out.println("Display linkedHashMap after removing key 2: "+linkedHashMap);

        // Iterating over keys and values
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + linkedHashMap.get(key));
        }

    }
}
