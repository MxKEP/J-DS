package QueueTests;


public class Result
{
    private int answer;
    private int input;

    public Result(int a, int r)
    {
        this.answer = a;
        this.input = r;
    }

    public void compute(int answer, int input)
    {
        if ( input < answer)
            System.out.println("your asnswer is too low");


        if ( input> answer)
            System.out.println("your asnswer is too high");

        if ( input == answer ) {
            System.out.println("CORRECT ANSWER!!!!");
            System.out.println("<33333333333333");
        }

    }
}
