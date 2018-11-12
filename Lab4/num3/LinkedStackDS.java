package Lab4.num3;

public class LinkedStackDS<T> implements LinkedStackADT<T>
{
    private class StackNode<T>
    {
        public T data;
        public StackNode<T> link;

        public StackNode()
        {
            data = null;
            link = null;
        }

        public StackNode(T element, StackNode<T> ptr)
        {
            data = element;
            link = ptr;
        }
    }

    private StackNode<T> top;

    public LinkedStackDS()
    {
        top = null;
    }

    public LinkedStackDS(T elemenet)
    {
        top = new StackNode<T>(elemenet, null);
    }

    @Override
    public boolean isEmptyStack()
    {
        return (top == null);
    }

    @Override
    public void push(T element)
    {
        top = new StackNode<T>(element, top);
    }

    @Override
    public T peek() throws StackUnderflowException
    {
        if (isEmptyStack())
            throw new StackUnderflowException("STACK IS EMPTY");

        return top.data;
    }

    @Override
    public String pop() throws StackUnderflowException
    {
        if (isEmptyStack())
            throw new StackUnderflowException("STACK IS EMPTY");

        String str = top.data +"";
        top = top.link;
        return str;
    }



}
