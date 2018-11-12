package L4.num1;

public interface ArrayStackADT<T>
{
    void initializeStack();

    // Returns TRUE if stack is empty
    boolean isEmptyStack();

    // Returns TRUE if stack is full
    boolean isFullStack();

    void push(T item) throws StackOverflowException;

    T peek() throws StackUnderflowException;

    void pop() throws StackUnderflowException ;

}