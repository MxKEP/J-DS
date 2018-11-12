package L4.num2;

import java.util.Scanner;

public class BaseConverter
{
        private class BaseNumber
    {
        private long number;
        private int base;

        public BaseNumber() {
        }

        public BaseNumber(int base, long number)
        {
            this.base = base;
            this.number = number;
        }
        public long getBase()
        {
            return base;
        }
        public void setBase(int x)
        {
            base = x;
        }
        public long getNumber()
        {
            return number;
        }
        public void setNumber(long x)
        {
            number = x;
        }
        @Override
        public String toString()
        {
            return number + " Base" + base;
        }
    }

    int base;
    ListStackDataStruc<String> stack;
    BaseNumber num1, num2, num3;

    public BaseConverter()
    {
        stack = new ListStackDataStruc<>();

        num1 = new BaseNumber();
        num2 = new BaseNumber();
        num3 = new BaseNumber();
        inputPrompt();

        convert(num1.number, num1.base);
        processAndPrint(num1.number, num1.base);
        convert(num2.number, num2.base);
        processAndPrint(num2.number, num2.base);
        convert(num3.number, num3.base);
        processAndPrint(num3.number, num3.base);
    }

    public void inputPrompt()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter three base 10 numbers: \n");
        num1.number = keyboard.nextLong();
        num2.number = keyboard.nextLong();
        num3.number = keyboard.nextLong();

        System.out.print("Enter three bases to convert to: \n");
        base = keyboard.nextInt();
        num1.setBase(base);
        base = keyboard.nextInt();
        num2.setBase(base);
        base = keyboard.nextInt();
        num3.setBase(base);
    }

    public void convert(long number, int base)
    {
        while ( number > 0 )
        {
            stack.push(number%base+"");
            number = number/base;
        }
    }

    public String convertAll(BaseNumber num)
    {
        String output = num +"";
        return output;
    }

    public void processAndPrint(long num, int base)
    {
        System.out.print(num + " (Base10) = ");
        while (!stack.isEmpty())
            System.out.print(stack.pop());

        System.out.print(" (Base " + base + ")\n");
    }
    @Override
    public String toString()
    {
        return stack.peek();
    }
}
