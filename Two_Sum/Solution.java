package Two_Sum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (hashMap.containsKey(remaining)) {
                return new int[]{hashMap.get(remaining), i};
            }
            else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
