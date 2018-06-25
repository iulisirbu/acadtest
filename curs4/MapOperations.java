package curs4;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

/*
        public static int countKey(){

        }
*/

    public static Map copyMap(Map<String,String> map){
        Map temp = new HashMap<>();
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
            temp.put(key,map.get(key));
        }

        return temp;
    }
/*
        public static boolean searchKeyMap(){}

        public static boolean searchValueMap(){}

        public static Object getKeyValue(){}
*/
}