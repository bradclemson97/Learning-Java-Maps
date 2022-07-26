package com.bradclemson97;

import java.util.HashMap;

public class Main {

    //A map is a collection of key-value pairs, essentially a look-up table

    public static void main(String[] args) {

        //A map of employee names (keys - strings) to their employee id numbers (values - integers)
        //Hashmap is a type of map that is most commonly used based on its underlying functionality
        //The two types we're using for key and value type have to be java classes and not primitive lower-case types (e.g. int, double)

        HashMap<String, Integer> empIds = new HashMap();

        empIds.put("John", 12345);
        empIds.put("Karl", 54321);
        empIds.put("Jerry", 876543);

        System.out.println(empIds);

        //Print out Karl's id
        System.out.println(empIds.get("Karl"));

        //Returns true or false to see if Jerry exits in the map
        System.out.println(empIds.containsKey("Jerry"));

        //Returns true or false on whether our map contains a certain value
        System.out.println(empIds.containsValue(876543));

        //If the key already exists it will update the old value and overrides it with the new value or adds the key value pair
        //if they don't already exist
        empIds.put("Karl", 54333);

        //'replace', will only replace the value to key if the key already exists - in this case Kramer doesn't exist
        empIds.replace("Kramer", 777);

        //Only add the key value pair if the pair don't exist already
        empIds.putIfAbsent("John", 222);

        //Removes key value pair
        empIds.remove("Steve");
    }
}
