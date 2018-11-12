package test;

public class ArrayQueue<T> {
    private final T[] array;
    private int top;
    private int capacity = 1000;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        array=(T[])new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(){
        array=(T[])new Object[capacity];
    }


    public boolean isEmpty(){
        if (top==0)
            return true;
        return false;
    }

    public int count(){
        return top;
    }

    public T peek(){
        return array[top];
    }


    public void enqueue(T t){
        if (top!=capacity){
            array[++top] = t;
        }else{
            System.err.println("Queue is full");
        }
    }
    public T dequeue(){
        if(!isEmpty()){
            return array[top--];
        }
        return null;

    }
}