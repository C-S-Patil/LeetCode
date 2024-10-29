package Valid_Parentheses;
import java.util.Arrays;

/**
 * @see  <a href="https://leetcode.com/problems/valid-parentheses">Valid Parentheses</a>
 */

public class validParentheses {
    public static void main(String arg[]) {
        String s = "{}(){}[][{(({}))}]";
        // Solution
        Solution solution = new Solution();
        System.out.println(solution.validParentheses(s));
    }
}
