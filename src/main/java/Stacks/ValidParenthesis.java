package Stacks;

import java.util.Stack;

public class ValidParenthesis {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true
     */
    public boolean isValid(String s) {
        Character openParenthesis = '(';
        Character closeParenthesis = ')';
        Character openBracket = '[';
        Character closeBracket = ']';
        Character openBrace = '{';
        Character closeBrace = '}';
        Stack<Character> stack = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (character == openBrace || character == openBracket || character == openParenthesis) {
                stack.push(character);
            }
            else if (character == closeBrace || character == closeBracket || character == closeParenthesis) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character check = stack.pop();
                if (check == openBrace && character != closeBrace) {
                    return false;
                }
                else if (check == openParenthesis && character != closeParenthesis) {
                    return false;
                }
                else if (check == openBracket && character != closeBracket) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
