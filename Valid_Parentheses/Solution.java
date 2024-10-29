package Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean validParentheses(String s) {
        Stack stack = new Stack();
        char [] chars = s.toCharArray();
        if (s.length() % 2 != 0) return false;
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                if (!stack.empty() && map.get(chars[i]) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.empty();
    }
}
