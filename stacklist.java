import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class stacklist {
    public static void main(String[] args) {
        Stack list = new Stack();
        {
            list.push(3);
            list.push(456);
            list.push(5);
            list.push(12);
            list.push(4);
            list.push(45);
            System.out.println(list);
            list.pop();
            System.out.println(list);
            list.pop();
            System.out.println(list);
            list.removeAll(list);
            System.out.println(list);


        }
    }
}

