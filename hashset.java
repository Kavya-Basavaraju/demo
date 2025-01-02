import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set list=new HashSet();
        {
            list.add("apple");
            list.add("mango");
            list.add("grapes");
            list.add("kevi");
            list.add("Banana");
            list.add("pineapple");
            System.out.println(list);
            list.remove("kevi");
            System.out.println(list);
            //list.clear();
            //System.out.println(list);
            list.addAll(list);
            System.out.println(list);

        }
    }
}
