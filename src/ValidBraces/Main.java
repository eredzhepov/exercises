package ValidBraces;

import java.util.Stack;

public class Main {
    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for(char ch : braces.toCharArray()){
            if(!stack.isEmpty() && isClosing(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
    public static boolean isClosing(char a, char b){
        return ( a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']');
    }
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }
}
