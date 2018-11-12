package Lab4.num2;

public interface ListStackADT<T>
{
    // Returns TRUE if stack is empty
    boolean isEmpty();

    // throws exception if stack is empty
    void ifEmpty();

    // pushes a <T> element to the top of the stack
    void push(T value);

    // returns top element in stack
    T peek();

    // returns and removes top element in stack
    String pop();
}

