package Lab5;

public class QueueUnderflowException extends QueueException
{
    public QueueUnderflowException()
    {
        super("Queue Underflow");
    }

    public QueueUnderflowException(String message)
    {
        super(message);
    }
}
