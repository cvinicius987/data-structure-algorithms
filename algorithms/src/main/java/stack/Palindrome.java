package stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var seq = scanner.next();

        if(isPalindrome(seq)){
            System.out.println(seq+" IS Palindrome");
        }else{
            System.out.println(seq+" IS NOT Palindrome");
        }
    }

    public static boolean isPalindrome(String word){

        var stack = new Stack<Character>();

        int i = 0;
        while(i < word.length()){
            stack.push(word.charAt(i));
            i++;
        }

        var result = new StringBuilder();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return word.equals(result.toString());
    }
}
