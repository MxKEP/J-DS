package Lab4.num2;

public class ListStackDataStruc<T> implements ListStackADT<T>
{
    private class StackNode<T>
    {
        public T value;
        public StackNode<T> link;

        public StackNode()
        {
            value = null;
            link = null;
        }
        public StackNode(T element, StackNode<T> ptr)
        {
            value = element;
            link = ptr;
        }
        public T getValue()
        {
            return value;
        }
        public void setValue(T value)
        {
            this.value = value;
        }
        public StackNode getNext()
        {
            return link;
        }
        public void setNext(StackNode next)
        {
            link = next;
        }
        @Override
        public String toString()
        {
            return value.toString();
        }
    }

    private StackNode<T> top;

    public ListStackDataStruc()
    {
        top = null;
    }
    public StackNode<T> getTop()
    {
        return top;
    }
    public void setTop(StackNode<T> newTop)
    {
        top = newTop;
    }

    @Override
    public boolean isEmpty()
    {
        return (top == null);
    }

    @Override
    public void ifEmpty()
    {
        throw new StackUnderflowException("EMPTY");
    }

    @Override
    public void push(T value)
    {
        top = new StackNode<T>(value, top);
    }

    @Override
    public T peek() throws StackUnderflowException
    {
        if (isEmpty())
            ifEmpty();

        return top.value;
    }
    @Override
    public String pop() throws StackOverflowException
    {
        if (isEmpty())
            ifEmpty();

        String str = top.value +"";
        top = top.link;
        return str;
    }
    @Override
    public String toString() {
        return top.toString();
    }
}
