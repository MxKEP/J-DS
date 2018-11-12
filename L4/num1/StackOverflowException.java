package L4.num1;

public class StackOverflowException extends StackException
{
    public StackOverflowException()
    {
        super("Stack Overflow");
    }

    public StackOverflowException(String message)
    {
        super(message);
    }
}
