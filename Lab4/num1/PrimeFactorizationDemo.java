package Lab4.num1;

public class PrimeFactorizationDemo
{
    public static void main(String[] args)
    {
        ArrayStackDataStruc<Integer> list = new ArrayStackDataStruc<>(50);

        int n[] = new int[]{3960, 1234, 222222, 13780};
        int i = 0;

        while (i <= 3)
        {
            try
            {
                int d = 2;
                while (n[i] > 1)
                {
                    if (n[i] % d == 0)
                    {
                        list.push(d);
                        n[i] = n[i] / d;
                    } else
                        d++;
                }
            } catch (StackOverflowException e) {
                System.out.println(e.toString());
               }

            System.out.print("Elements are: ");
            while (!list.isEmptyStack())
            {
                System.out.print(list.peek());
                list.pop();
                if (!list.isEmptyStack())
                    System.out.print(" * ");
            }
            System.out.println();
            i++;
        }
    }
}