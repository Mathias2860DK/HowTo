package lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/* LinkedList
 * The LinkedList class has all of the same methods as the ArrayList class
 *  because they both implement the List interface.
 *  This means that you can add items, change items, remove items and clear the list in the same way.
 *
 * It is best to use an ArrayList when:
 * You want to access random items frequently
 * You only need to add or remove elements at the end of the list
 *
 * It is best to use a LinkedList when:
 * You only use the list by looping through it instead of accessing random items
 * You frequently need to add and remove items from the beginning, middle or end of the list
 *  */

public class AllLists {
    public static void main(String[] args) {
        LinkedList <String> linky = new LinkedList<String>();
        Vector <String> test = new Vector<String>();

        linky.add("Mathias");
        linky.add("Mustafa");
        linky.add("Markus");
        linky.addFirst("Thor");

        System.out.println(linky); // all elements
        System.out.println(linky.getLast()); // last element
        /* When looping through a LinkedList you have to use an Iterator */

        Iterator it = linky.iterator();
        while (it.hasNext()){
            if (it.next().equals("Mustafa")){
                System.out.println("We found Mustafa using iterator");
            }
        }

        test.add("vector");
        System.out.println(test);

    }
}
