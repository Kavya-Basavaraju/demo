import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treesset {
    public static void main(String[] args) {
        Set list = new TreeSet();
        {
            list.add(3);
            list.add(1);
            list.add(8);
            list.add(12);
            list.add(4);
            System.out.println(list);
        }
    }
}
