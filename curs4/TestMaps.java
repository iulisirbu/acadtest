package curs4;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {

    public static void main(String[] args) {
        //Define a map
        Map<String, String> map = new HashMap<>();

        //Associates the specified value with the specified key in this map
        map.put("brand", "Mini Copper S");
        map.put("price", "20.000");
        map.put("color", "red");
        map.put("speed", "fast");

//        1. Write a Java program to count the number of key-value (size) mappings in a map
        int size = map.size();
        System.out.println("1.-------------------------------");
        System.out.println("The size of the map is : " + size);

//        2. Write a Java program to copy all of the mappings from the specified map to another map
        System.out.println("2.-------------------------------");
        Map<String,String> duplicate = Map.copyOf(map);
        for (String key : duplicate.keySet()) {
            System.out.println(key + " : " + duplicate.get(key));
        }



//        4. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("4.-------------------------------");
        boolean contains = map.containsKey("brand");
        if (contains)
            System.out.println("The mapping for the specified key is " + map.get("brand"));
        else
            System.out.println("Map doesn't contain a mapping for the specified key");

//        5. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("5.-------------------------------");
        System.out.println(map.containsValue("red"));


//        6. Write a Java program to get the value of a specified key in a map.
        System.out.println("5.-------------------------------");
        System.out.println(map.get("brand"));

        //        3. Write a Java program to check whether a map contains key-value mappings or not.
        System.out.println("3.-------------------------------");
        map.isEmpty();
        if ( map.isEmpty())
            System.out.println("Map doesn't have key-value mappings");
        else
            System.out.println("Map contains key-value mappings");


        System.out.println("3.-------------------------------");
        //Removes all of the mappings from this map
        map.clear();
        System.out.println(map.isEmpty());


    }

}
