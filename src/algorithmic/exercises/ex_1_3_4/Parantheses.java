package algorithmic.exercises.ex_1_3_4;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
Write a stack client Parentheses that reads in a text stream from standard input and uses a stack to determine
whether its parentheses are properly balanced. For ex-ample, your program should print true
for [()]{}{[()()]()} and false for [(]).
 */
public class Parantheses {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        boolean paired = true;
        while (!StdIn.isEmpty() && paired) {
            char inputChar = StdIn.readChar();

            if (inputChar == '(' || inputChar == '[' || inputChar == '{') {
                stack.push(inputChar);
            } else {
                Character stackChar = stack.pop();

                paired = (inputChar == ')' && stackChar == '(') ||
                        (inputChar == '}' && stackChar == '{') ||
                        (inputChar == ']' && stackChar == '[');
            }
        }

        StdOut.println(paired && stack.isEmpty());
    }
}
