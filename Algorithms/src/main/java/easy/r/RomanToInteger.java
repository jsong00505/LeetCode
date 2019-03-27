package easy.r;

/**
 * Created by jsong on 2019-03-26.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Roman to Integer(https://leetcode.com/problems/roman-to-integer/)
 */
public class RomanToInteger {
  public int romanToInt(String s) {
    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    int result = 0;
    int sIndex = 0;
    for (int i = 0; i < symbols.length; i++) {
      while (s.substring(sIndex).startsWith(symbols[i])) {
        result += nums[i];
        sIndex += symbols[i].length();
        if (sIndex == s.length()) {
          break;
        }
      }
    }
    return result;
  }
}
