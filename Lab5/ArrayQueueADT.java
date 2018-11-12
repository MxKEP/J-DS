package Lab5;

public interface ArrayQueueADT<T>
{
    boolean isEmpty(); // returns TRUE if queue is empty
    int count(); // returns number of elements in the queue
    T peek(); // returns first element in the queue
    void enqueue(T element); // adds element to the queue
    void dequeue(); // removes element from the queue
}
