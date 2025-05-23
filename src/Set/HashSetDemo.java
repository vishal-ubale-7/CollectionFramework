package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[]args)
    {
        ArrayList ar = new ArrayList<>();

        ar.add(1);
        ar.add(2);
        ar.add(3);

        HashSet hs = new HashSet();

        hs.addAll(ar);    // add the LinkedList object here use AddAll method
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add("vishal");
        hs.add(30);
        hs.add(null);

        hs.remove(30);  // remove the 30 element
        // hs.clear();   // remove the all elements
        System.out.println(hs.contains(1));  // search element
        System.out.println(hs);
    }

}
