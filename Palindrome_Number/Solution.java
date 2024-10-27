package Palindrome_Number;

public class Solution {
    public boolean isPalindrome(int x) {

        // reverse number using /10 and %10.
        if (x >= 0) {
            int remaining = x;
            int reverse = 0;
            while (x != 0) {
                reverse = reverse * 10 + x % 10;
                x = x / 10;
            }
            // compare the reverse and x
            return reverse == remaining;
        } else {
            return false;
        }
    }
}
