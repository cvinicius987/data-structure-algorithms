package structure.stack.algorithms;

import java.util.Scanner;
import java.util.Stack;
import java.util.function.Consumer;

public class CopyBetweenStack {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        var stackPar   = new Stack<Integer>();
        var stackImpar = new Stack<Integer>();

        for (int i = 1; i <= 10; i++){

            var number = scan.nextInt();

            if(number == 0){

                if(stackPar.isEmpty() || stackImpar.isEmpty()){
                    System.out.println("Stack are emptys");
                }
                else{
                    System.out.println("Removendo the number "+stackPar.pop()+" from stackPar");
                    System.out.println("Removendo the number "+stackImpar.pop()+" from stackImpar");
                }
            }
            else{

                if(number % 2 == 0){
                    System.out.println("Added the number "+stackPar.push(number)+" on stackPar");
                }
                else{
                    System.out.println("Added the number "+stackImpar.push(number)+" on stackImpar");
                }
            }
        }

        System.out.println(" =========== Cleaning the stackPar =============== ");

        while(!stackPar.isEmpty()){
            System.out.println("Removed the number "+stackPar.pop()+" on stackPar");
        }

        System.out.println(" =========== Cleaning the stackImpar =============== ");

        while(!stackImpar.isEmpty()){
            System.out.println("Removed the number "+stackImpar.pop()+" on stackImpar");
        }
    }
}
