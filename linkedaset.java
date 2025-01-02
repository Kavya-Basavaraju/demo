import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class linkedaset {
    public static void main(String[] args) {
        Set list = new LinkedHashSet();
        {
           list.add(3);
            list.add(456);
            list.add(5);
            list.add(12);
            list.add(4);
            list.add(45);
            System.out.println(list);
            list.add("kavya");
            list.add("chandana");
            list.add("punith");
            list.add("divya");
            list.add("basavaraj");
            list.add("lavu");
            System.out.println(list);

        }
    }
}
