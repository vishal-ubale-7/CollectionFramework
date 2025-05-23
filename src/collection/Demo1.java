package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1
{
    public static void main(String []args )
    {
         // Problem: Given a list of integers,remove the duplicates
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,7,7);
        Set<Integer> set = new HashSet<>(list); // create Hashset object because hashset not allows duplicate element
        System.out.println(set);

    }
}

