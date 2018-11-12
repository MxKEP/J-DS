package L5;

public class QueueException extends RuntimeException
{
    public QueueException()
    {
        super("QUEUE INVALID");
    }

    public QueueException(String message)
    {
        super(message);
    }
}
