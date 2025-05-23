package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo3
{
    public static void main(String[]args)
    {
        //Problem: Count the frequency of each element in a list.

        List<String> list = Arrays.asList("banana" ,"banana" ,"apple","mango","orange");//This creates a fixed-size list of strings using
        Map<String,Integer> freqmap = new HashMap<>();
        for(String fruit : list)
        {
            freqmap.put(fruit, freqmap.getOrDefault(fruit,0)+1); // checks if the fruit is already in the map.
            // freqmap.put(fruit, ...) updates the map with the new count.
        }
        System.out.println(freqmap);

        // output :{banana=2, orange=1, apple=1, mango=1}

    }
}
