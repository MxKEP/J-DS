package Lab4.num3;

public interface LinkedStackADT<T>
{
    // Returns true if the stack is empty
    boolean isEmptyStack();

    // Pushes a <T> element to the top of the stack
    void push(T element);

    // Returns top element of the stack
    T peek();

    // Returns and removes top element of the stack
    String pop();

}
