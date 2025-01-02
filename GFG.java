
// Java Program to Illustrate remove() method

// Importing required classes
import java.io.*;
        import java.util.LinkedList;

// Main class
public class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an empty LinkedList of string type
        LinkedList<String> list = new LinkedList<String>();

        // Adding elements in the list
        // using add() method
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        // Printing the elements before removal
        // inside above created LinkedList object
        System.out.println("LinkedList:" + list);

        // Removing the head
        // using remove() method
        list.remove("Geeks");
        list.remove("20");
        list.remove("10");

        // Printing the final elements after removal
        // inside above LinkedList object
        System.out.println("Final LinkedList:" + list);
    }
}

