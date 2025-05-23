package collection;

import java.util.HashMap;
import java.util.Map;

public class Demo4
{
    public static void main(String []args ) {
        // Problem: Print all keys and values in a map.

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());

//            Output
//            A --> 1
//            B --> 2
//            C --> 3
//            D --> 4

        }
    }
}
