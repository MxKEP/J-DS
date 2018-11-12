package Lab4.num3;

import javax.swing.*;

public class PalindromeDemo
{
    public static void main(String[] args) {

        LinkedStackDS<Character> stack = new LinkedStackDS<>();
        int count = 0 ;
        String result = "";

        do {
            String testStr = JOptionPane.showInputDialog(null, "Input a String for Palindrome test: ");
            String str = testStr.replaceAll("\\s", "").replaceAll("[^a-zA-Z]", "");
            String reverse = "";

            for ( int i =0 ; i < str.length(); i++)
                stack.push(str.charAt(i));

            while (!stack.isEmptyStack())
                reverse += stack.pop();

            String testResult ="";
            if ( str.equalsIgnoreCase(reverse))
                result += testStr + " is a palindrome.\n";
            else
                result += testStr + " is NOT a palindrome.\n\n\n\n\n\n\n\n";

            result += testResult;
            count++;
        }while ( count <= 4);

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);

    }
}

