import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class vectors
{
    public static void main(String[] args) {
        List mylist = new Vector();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);
        System.out.println(mylist);
        mylist.remove(2);
        System.out.println(mylist);
        mylist.add(3,60);
        System.out.println(mylist);
        mylist.add(70);
        System.out.println(mylist);
        mylist.remove(1);
        System.out.println(mylist);
        mylist.remove(3);
        mylist.remove(1);
        mylist.remove(0);
        System.out.println(mylist);
        Collections.sort(mylist);
        System.out.println(mylist);
    }
}
