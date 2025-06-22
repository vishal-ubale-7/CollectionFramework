package Map;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main(String []args)
    {
        HashMap<Integer ,String> hm = new HashMap(); // store key-map value paire 
        hm.put(10,"aaa");
        hm.put(11,"bbb");
        hm.put(12,"ccc");
        hm.put(13,"ddd");
        hm.put(14,"eee");
        hm.replace(10,"zzz");   // replace value

    //    hm.remove(10); //  remove the element
    //    System.out.println(hm.containsKey(13)); // search the key return boolean value
     //    System.out.println(hm.containsValue("zzz")); // return value boolean type

        System.out.println(hm);
//        for(Map.Entry me : hm.entrySet())
//        {
//            System.out.println(me.getkey()+" -> "+me.getValue());
//        }  // retrive the value


    }
}
