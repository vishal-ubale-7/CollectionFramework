package List;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(20);
        v.add(1,"vishal");
        v.addElement("ravi");
        v.addElement(100);
        v.add(300);
        v.add('c');

        v.removeElementAt(1); //remove 1 index element- not write system.out.println because return type is void
        System.out.println(v.removeElement(100)); // removeElement method return boolean type
        System.out.println(v.lastElement()); // display last element

        System.out.println(v.capacity()); // display capacity
        System.out.println(v);
    }


}
