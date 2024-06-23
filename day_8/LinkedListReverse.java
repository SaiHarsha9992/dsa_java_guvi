import java.util.LinkedList;
import java.util.Collections;

public class LinkedListReverse {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original LinkedList: " + list);

        // Reverse using Collections
        Collections.reverse(list);

        System.out.println("Reversed LinkedList: " + list);
    }
}
