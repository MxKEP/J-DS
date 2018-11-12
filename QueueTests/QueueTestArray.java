package QueueTests;

public class QueueTestArray<T>
{
    private int maxQueueSize;
    private int count;
    private int queueFront;
    private int queueRear;
    private T[] list;

    public QueueTestArray()
    {
        maxQueueSize = 100;
        queueFront = 0;
        queueRear = maxQueueSize - 1;
        count = 0;
        list = (T[]) new Object[maxQueueSize];
    }

    public QueueTestArray(int queuesize)
    {
        if (queuesize <= 0)
        {
            System.err.println("The size of the array must be positive -- Creating an array of the size 100");

            maxQueueSize = 100;

        }else
            maxQueueSize = queuesize;

        queueFront = 0;
        queueRear = maxQueueSize - 1;
        count = 0;
        list = (T[]) new Object[maxQueueSize];
    }

    // USE MOD OPERATOR TO ADVANCE QUEUEREAR BECAUSE ARRAY IS CIRCULAR
    public void initializeQueue()
    {
        for (int i = queueFront; i < queueRear ; i = ( i + 1) % maxQueueSize)
            list[i] = null;

        queueFront = 0;
        queueRear = maxQueueSize - 1;
        count = 0;
    }

    public boolean isEmptyQueue()
    {
        return (count == 0);
    }
    public boolean isFullQueue()
    {
        return (count == maxQueueSize);
    }

    public T front() throws Exception
    {
        if ( isEmptyQueue())
            throw new Exception("QUEUE UNDERFLOW");

        return (T) list[queueFront];
    }

    public T back() throws Exception
    {
        if ( isEmptyQueue())
            throw new Exception("QUEUE UNDERFLOW");

        return (T) list[queueRear];
    }

    public void addQueue(T element) throws Exception
    {
        if ( isEmptyQueue())
            throw new Exception("QUEUE OVERFLOW");

        queueRear = ( queueRear + 1 ) % maxQueueSize;
        count++;
        list[queueRear] = element;
    }

    public void deleteQueue() throws Exception
    {
        if (isEmptyQueue())
            throw new Exception("UNDERFLOW");

        count--;
        list[queueFront] = null;

        queueFront = (queueFront + 1) % maxQueueSize;
    }

}
