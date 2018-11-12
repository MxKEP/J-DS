package Lab5;

public class QueueOverflowException extends QueueException
{
    public QueueOverflowException()
    {
        super("Queue Overflow");
    }

    public QueueOverflowException(String message) {
        super(message);
    }
}
