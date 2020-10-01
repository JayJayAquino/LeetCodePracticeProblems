// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// 
// An input string is valid if:
// 
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Note that an empty string is also considered valid.

import java.io.*; 
import java.util.*; 

public class validParens {
    public static void main(String [] Args) {
        String test1 = "()";
        String test2 = "([)]";
        String test3 = "[()]";
        String test4 = ")()";

        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // false
        System.out.println(isValid(test3)); // true
        System.out.println(isValid(test4)); // false
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && !stack.empty()) {
                if(stack.peek() == '('){
                    stack.pop(); //valid
                } else {
                    return false; //invalid closing
                }
            } else if(s.charAt(i) == '}' && !stack.empty()) {
                if(stack.peek() == '{'){
                    stack.pop();
                } else {
                    return false;
                }
            } else if(s.charAt(i) == ']' && !stack.empty()) {
                if(stack.peek() == '['){
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false; // string begins with a close parnes
            }
        }

        return true;
    }
}