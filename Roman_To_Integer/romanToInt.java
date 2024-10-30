package Roman_To_Integer;

/**
 * @see  <a href="https://leetcode.com/problems/roman-to-integer/">Roman To Integer</a>
 */

public class romanToInt {
  public static void main(String []args) {
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    String input = "MCMXCIV";
    Solution solution = new Solution();
    System.out.println(solution.romanToInt(input));
  }
}
