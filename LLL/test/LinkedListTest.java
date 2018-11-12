package LLL.test;
import java.util.Scanner;

public class LinkedListTest
{
    static Scanner keyboard = new Scanner(System.in);

    //returns a LLL of strings
    public static LLinkedList getList()
    {
        final String SENTINEL = "-999";
        LLinkedList list = new LLinkedList();
        System.out.println("Enter a list of words");
        System.out.println("Terminate with " + SENTINEL);
        String word;
        word = keyboard.next();     // read user input

        while ( ! (word.equals(SENTINEL)))
        {
            list.addLast(word);
            word = keyboard.next();
        }
        return list;
    }

    // Search for key in LinkedList
    // Return true if found
    public static boolean search(LLinkedList list , Object key)
    {
        ListNode current = list.getFirstNode();
        while ( current != null)
        {
            if ( current.getValue().equals(key))
                return true;
            current = current.getNext();
        }
        return false;
    }

    public static void main(String[] args)
    {
        // TESTING getList() AND toString()
        LLinkedList list = getList();
        System.out.println("List is: ");
        System.out.println(list);

        // TESTING removeFirst() AND removeLast()
        String first = (String) list.removeFirst();
        System.out.println("The first element was: " + first);
        String last = (String) list.removeLast();
        System.out.println("The last element was: " + last);
        System.out.println("List is:  ");
        System.out.println(list);

        // TESTING search()
        System.out.println("Enter a key word for search: ");
        String key;
        key = keyboard.next();  // read user input
        if (search(list, key))
            System.out.println(key + " is in the list.");
        else
            System.out.println(key + " is not in the list.");
    }
}
