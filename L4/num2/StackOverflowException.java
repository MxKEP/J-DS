package L4.num2;

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
