package L5;

public class ArrayQueue<T> implements ArrayQueueADT<T>
{
    private T[] list;
    private int queueFront =0; // index at front of queue
    private int queueRear; // index at rear of queue
    private int count;  // number of elements in the Queue
    private int maxSize = 1440; // default capacity

    // Default constructor
    public ArrayQueue()
    {
        queueRear = maxSize - 1;
        count = 0;
        list = (T[]) new Object[maxSize];
    }
    @Override
    public boolean isEmpty()
    {
        return (count == 0);
    }
    @Override
    public int count()
    {
        return count;
    }
    @Override
    public T peek()
    {
        if (isEmpty())
            System.err.println("Queue is empty");

        return list[queueFront];
    }
    @Override
    public void enqueue(T element)
    {
        if (count == list.length)
            System.err.println("Queue is full.");

        queueRear = (queueRear + 1) % list.length;
        list[queueRear] = element;
        count++;
    }
    @Override
    public void dequeue()
    {
        if (isEmpty())
            System.err.println("Queue is empty");

        list[queueFront] = null;
        count--;
        queueFront = (queueFront + 1) % list.length;
    }
}
