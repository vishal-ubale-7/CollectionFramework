package Map;


import java.util.HashMap;
import java.util.Map;

public class MapDemo
{
    public static void main(String []args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "vishal");
        map.put(2, "ajay");
        map.put(3, "pranav");
        map.put(4, "raj");

        //map.remove(4);   // remove the element basis of key
       // map.replace(1,"abhay");  // replace the name 1 position
        // System.out.println(map.containsKey(3));  // contain method return boolean type value
        // System.out.println(map.containsValue("raj"));  // get value to use containsValue method
       // System.out.println(map.get(1));  // get the value according to key
        System.out.println(map.size());   // how many size of map
        System.out.println(map);



    }
}
