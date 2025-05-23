package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2
{
    public static void main(String []args )
    {
       // Problem: Sort a list of strings alphabetically
        List<String> list = Arrays.asList("Banana", "Apple", "Mango" );
        Collections.sort(list);  // use sort method
        System.out.println(list);
    }
}
