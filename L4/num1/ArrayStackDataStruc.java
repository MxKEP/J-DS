package L4.num1;

public class ArrayStackDataStruc<T> implements ArrayStackADT<T>
{
    private T[] data;
    private int maxElements;
    private int stackTop;

    public ArrayStackDataStruc()
    {
        maxElements = 50;
        stackTop = 0;
        data = (T[]) new Object[maxElements];
    }

    public ArrayStackDataStruc(int elements)
    {
        maxElements = elements;
        stackTop = 0;
        data = (T[]) new Object[maxElements];
    }

    @Override
    public void initializeStack()
    {
        for (int i = 0; i < stackTop; i++)
            data[i] = null;

        stackTop = 0;
    }
    @Override
    public boolean isEmptyStack()
    {
        return (stackTop == 0);
    }

    @Override
    public boolean isFullStack()
    {
        return (stackTop == maxElements);
    }

    @Override
    public void push(T item) throws StackOverflowException
    {
        if (isFullStack())
            throw new StackOverflowException();

        data[stackTop] = item;
        stackTop++;
    }
    @Override
    public T peek() throws StackUnderflowException
    {
        if (isEmptyStack())
            throw new StackUnderflowException();

        return data[stackTop - 1];
    }
    @Override
    public void pop() throws StackUnderflowException
    {
        if (isEmptyStack())
            throw new StackUnderflowException();

        stackTop--;
        data[stackTop] = null;
    }
}
