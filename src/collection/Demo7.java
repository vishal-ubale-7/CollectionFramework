package collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Demo7
{
    public static void main(String []args)
    {
        //Problem: Convert map keys and values into separate lists.

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        List<String> keys = new LinkedList<>(map.keySet());
        List<Integer> values = new LinkedList<>(map.values());

        System.out.println(keys);
        System.out.println(values);



    }

}
