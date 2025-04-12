package Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
     public static void main(String []args)
     {
         Set  s = new HashSet();
         s.add(10); // dose not store index based
         s.add(20);
         s.add(30);
         s.add(10);  // not maintain order
         s.add(null);  // store only one null value
         s.add(null);
         System.out.println(s);
     }
}
