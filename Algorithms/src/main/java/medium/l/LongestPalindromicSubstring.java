package medium.l;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Longest Palindromic Substring
 * (https://leetcode.com/problems/longest-palindromic-substring/)
 */
public class LongestPalindromicSubstring {

  public String longestPalindrome(String s) {

    int length = s.length();


    return "";
  }

  // time limit exceeded(recursive method)
  public String timeLimitExceeded(String s) {

    int length = s.length();
    int midIndex = length / 2;
    boolean odd = length % 2 == 1;

    String left = s.substring(0, midIndex);
    String right = s.substring(midIndex);
    if(odd) {
      right = s.substring(midIndex + 1);
    }

    right = new StringBuilder(right).reverse().toString();
    if(left.equals(right)) {
      return s;
    } else {
      left = timeLimitExceeded(s.substring(0, length - 1));
      right = timeLimitExceeded(s.substring(1, length));
    }

    return left.length() > right.length() ? left : right;
  }
}
