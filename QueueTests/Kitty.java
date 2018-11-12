package QueueTests;

import java.util.Scanner;

/**
 * Created by MP on 11/13/2016.
 */
public class Kitty
{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] ten = new int[10];
        int input;


        int answer = 7;

        int j = 1;

        for (int i = 0 ; i < 10 ; i++ ){
            ten[i] = j;
            j++;
        }

        System.out.println("guess a number from one to ten");
        input = keyboard.nextInt();

        Result res = new Result(answer, input);




    }
}
