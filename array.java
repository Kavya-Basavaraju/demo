import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("kavya");
        mylist.add("vidhayaranyapura");
        mylist.add("purisagu");
        mylist.add("chitradurga");
        mylist.add("chandana");
        mylist.add("bangalore");
        mylist.add(23);
        mylist.add("mandya");
        mylist.add("chapathi");
        mylist.add("pune");
        System.out.println(mylist);
        mylist.remove("chapathi");
        mylist.remove("bangalore");
        System.out.println(mylist);
        mylist.add(0 ,"chandana");
        mylist.add(1 ,"channigiri");
        mylist.add(2 ,23);
        System.out.println(mylist);
        mylist.remove(2);
        System.out.println(mylist);
    }
}
