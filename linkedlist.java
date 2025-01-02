import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        List mylist = new LinkedList();
        mylist.add("kavya");
        mylist.add("B");
        mylist.add("GUARDIAN ANGEL SCHOOL");
        mylist.add("SJM POLYTECHNIC");
        mylist.add("SIR MVIT");
        mylist.add("1mv21cs402");
        System.out.println(mylist);
        mylist.add(2,"computer science");
        System.out.println(mylist);
        mylist.add(4,"BANGALORE");
        System.out.println(mylist);
        mylist.remove("GUARDIAN ANGEL SCHOOL");
        System.out.println(mylist);
        mylist.remove(4);
        mylist.remove("B");
        System.out.println(mylist);
    }
}
