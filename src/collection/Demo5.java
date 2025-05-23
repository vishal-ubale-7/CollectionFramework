package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo5
{
    public static void main(String[]args)
    {
      //  Check if a list of integers is a palindrome.

        List<Integer> list = Arrays.asList(1,2,3,2,1);

        List<Integer> reversed = new ArrayList<>(list); //copy the list
        Collections.reverse(reversed);  // reversed list

        System.out.println(list.equals(reversed)); // compare two list and reverse list use equals method
        System.out.println(reversed); // print the reversed list

    }
}
