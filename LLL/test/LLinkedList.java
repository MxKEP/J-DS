package LLL.test;

import java.util.NoSuchElementException;

public class LLinkedList {

    private ListNode firstNode;

    //construct an empty list
    public LLinkedList()
    {
        firstNode = null;
    }

    //return true if list is empty
    public boolean isEmpty()
    {
        return firstNode == null;
    }

    //accesses the first node; needed to traverse the list
    public ListNode getFirstNode()
    {
        return firstNode;
    }

    //changes the first node in the list
    public void setFirstNode(ListNode node)
    {
        firstNode = node;
    }

    //insert object o at front of list
    public void addFirst(Object o)
    {
        if ( isEmpty() )
            firstNode = new ListNode(o, null);
        else
            firstNode = new ListNode(o, firstNode);
    }

    //insert at end of list
    public void addLast(Object o)
    {
        if ( isEmpty() )
            firstNode = new ListNode(o, null);
        else
        {
            ListNode current = firstNode;
            while (current.getNext() != null)
                current = current.getNext();

            current.setNext(new ListNode(o, null));
        }
    }

    //remove and return first element
    public Object removeFirst()
    {
        if ( isEmpty() )
            throw new NoSuchElementException("Cant remove from an empty list.");
        Object item = firstNode.getValue();
        firstNode = firstNode.getNext();
        return item;
    }

    //remove and return last element
    public Object removeLast()
    {
        if (isEmpty())
            throw new NoSuchElementException("Cant remove from an empty list.");
        ListNode current = firstNode;
        ListNode follow = null;
        while (current.getNext() != null )
        {
            follow = current;
            current = current.getNext();
        }

        if (follow == null)
            firstNode = null;
        else
            follow.setNext(null);
        return  current.getValue();
    }

    //return the LLL as String
    @Override
    public String toString()
    {
        if ( isEmpty() )
            return "empty";
        else
        {
            String s = "";
            ListNode current = firstNode;
            while (current != null)
            {
                s = s + current.getValue() + " ";
                current = current.getNext();
            }
            return s;
        }
    }
}
