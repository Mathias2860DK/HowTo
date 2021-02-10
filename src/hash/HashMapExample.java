package hash;

/*
HashMap store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
Keys and values are objects. Therefore you need wrapper classes. So instead of int use Integer.
 */

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap <String, String> capitalCities = new HashMap<>(); //create HashMap object
        //Add keys and values to HashMap
        capitalCities.put("England","London");
        capitalCities.put("Denmark","Copenhagen");
        capitalCities.put("Sweeden","Stockholm");
        System.out.println(capitalCities);
        //To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(capitalCities.get("Denmark"));
        System.out.println(capitalCities.size());
// looping through a HashMap
        for (String i: capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }


    }
}
