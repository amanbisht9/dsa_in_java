package dsa_in_java.BasicDataStructures.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        //Creating a hash map
        Map<Integer, String> hashMap = new HashMap<>();
        
        //Adding key value pair in HashMap
        hashMap.put(1, "Aman");
        hashMap.put(2, "Emmie");
        hashMap.put(3, "Alen");
        hashMap.put(4, "Ella");
        hashMap.put(5, "Emma");

        //Display the hash map
        System.out.println("Display hashmap: "+hashMap);

        //Display second element of hashmap
        System.out.println("Display second element: "+hashMap.get(2));

        //Removing key 2 from hashmap
        hashMap.remove(2);

        //Display the hash map
        System.out.println("Display hashmap after removing key 2: "+hashMap);

        // Iterating over keys and values
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }


    }
    
}
