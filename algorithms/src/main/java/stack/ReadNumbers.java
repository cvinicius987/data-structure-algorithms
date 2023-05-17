package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReadNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var stack = new Stack<Integer>();

        for (int i = 1; i <= 10; i++){

            var number = scan.nextInt();

            if(number % 2 == 0){
                stack.add(number);

                System.out.println("Add number");
            }
            else{
                if(stack.isEmpty()){
                    System.out.println("Stack is empty...");
                }
                else{
                    System.out.println("Remove number: "+stack.pop());
                }
            }
        }
        
        System.out.println("All numbers from stack read.");

        while(!stack.isEmpty()){

            Integer element = stack.pop();

            if(element == null){
                System.out.println("The Stack is empty");
            }
            else{
                System.out.println("Remove on the final the number: "+element);
            }
        }
    }
}
