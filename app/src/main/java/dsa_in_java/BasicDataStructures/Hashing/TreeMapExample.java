package dsa_in_java.BasicDataStructures.Hashing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    // Although TreeMap is technically not a hash table, it can be used for 
    // key-value storage with sorted key ordering. It uses a Red-Black tree 
    // rather than hashing and is ideal for cases where a sorted order is required.

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        //Adding key value pair in treeMap
        treeMap.put(5, "Aman");
        treeMap.put(3, "Emmie");
        treeMap.put(1, "Alen");
        treeMap.put(2, "Ella");
        treeMap.put(4, "Emma");

        //Display the treeMap
        System.out.println("Display treeMap: "+treeMap);

        //Display second element of treeMap
        System.out.println("Display second element: "+treeMap.get(2));

        //Removing key 2 from treeMap
        treeMap.remove(2);

        //Display the treeMap
        System.out.println("Display treeMap after removing key 2: "+treeMap);

        // Iterating over keys and values
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

    }
    
}
