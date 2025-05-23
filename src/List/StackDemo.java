package List;

import java.util.Stack;

public class StackDemo
{
     public static void main (String []args)
     {
         Stack s = new Stack();
         s.push(100);
         s.push(200);
         s.push(300);
         s.push("raj");
         s.push("aaj");
         System.out.println(s);
         //System.out.println(s.pop());  // remove the tpo element
         //System.out.println(s.peek()); // display top element
         System.out.println(s.search("aaj")); // search element
         System.out.println(s);


     }
}
