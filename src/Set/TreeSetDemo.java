package Set;


import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String []args)
    {
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.remove(40);  // remove 40
    //    ts.add(null);  null pointer exception
        System.out.println(ts);
    }
}
