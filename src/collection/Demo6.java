package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo6
{
    public static void main(String[]args)
    {
      // Problem: Reverse the order of elements in a list

        List list = Arrays.asList(10,20,30,40,50);
        Collections.reverse(list); // use the reverse method
        System.out.println(list);
    }
}
