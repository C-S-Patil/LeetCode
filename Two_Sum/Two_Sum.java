package Two_Sum;
import java.util.Arrays;

/**
 * @see  <a href="https://leetcode.com/problems/two-sum/">Two Sum Problem</a>
 */

public class Two_Sum {
    public static void main(String arg[]) {
        int[] nums = {1,2,3,4};
        int target = 6;
        // Solution
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
