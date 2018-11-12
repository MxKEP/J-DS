package QueueTests;

public class QueueTestLinkedList<T>
{
    // DEFINITION OF THE NODE CLASS
    protected class QueueNode<T>
    {
        T info;
        QueueNode<T> link;

        public QueueNode()
        {
            info = null;
            link = null;
        }

        public QueueNode(T elem, QueueNode<T> ptr)
        {
            info = elem;
            link = ptr;
        }

        @Override
        public String toString() {
            return info.toString();
        }
    }

    private QueueNode<T> front;
    private QueueNode<T> rear;

    public QueueTestLinkedList()
    {
        front = null;
        rear = null;
    }

    public void initializeQueue()
    {
        front = null;
        rear = null;
    }

    public boolean isEmptyQueue()
    {
        return (front == null);
    }

    public boolean isFullQueue()
    {
        return false;
    }

    public T front()
    {
        //if empty
        //  throw exc

        return front.info;
    }

    public T back()
    {
        //if empty
        //  throw exc

        return  rear.info;
    }

    public void addQueue(T newElem)
    {
        QueueNode<T> newNode;

        newNode = new QueueNode<T>(newElem, null);

        if (front == null)
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.link = newNode;
            rear = rear.link;
        }
    }

    public void deleteFirst()
    {
        //if empty
        //  throw exc

        front = front.link;

        if (front == null)
            rear = null;
    }
}
