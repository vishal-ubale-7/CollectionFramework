package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo
{
     public static void main(String []args)
     {
         List l = new ArrayList();
         l.add(0,10); // index based
         l.add(20);
         l.add(10);   // allow the duplicate elements
         l.add(null); // allow any numbers of null value
         l.add(null);

         System.out.println(l);

         Iterator itr = l.iterator();  // run one by one
         while (itr.hasNext())
         {
             System.out.println(itr.next());
         }

     }
}
