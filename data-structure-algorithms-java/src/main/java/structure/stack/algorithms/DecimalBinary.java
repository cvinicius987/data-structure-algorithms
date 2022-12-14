package structure.stack.algorithms;

import java.util.Stack;

public class DecimalBinary {

    public String decimalToBinary(int decimal){

        Stack<Integer> numbers = new Stack<>();

        int dif = 0;

        while(decimal > 0){

            dif = decimal % 2;

            numbers.push(dif);

            decimal /= 2;
        }

        StringBuilder str = new StringBuilder();

        while(!numbers.isEmpty()){

            str.append(numbers.pop());
        }

        return str.toString();
    }
}
