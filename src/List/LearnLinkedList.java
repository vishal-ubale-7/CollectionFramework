package List;

import java.util.LinkedList;

public class LearnLinkedList
{
    public static void main(String args [])
    {
        LinkedList ll = new LinkedList();   // store duplicate value
        ll.add(234);
        ll.add(34.75);
        ll.add("vishal");
        ll.add('e');
        ll.add(null);
        System.out.println(ll);
    }

}
