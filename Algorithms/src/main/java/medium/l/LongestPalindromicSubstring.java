package medium.l;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Longest Palindromic Substring
 *     (https://leetcode.com/problems/longest-palindromic-substring/)
 */
public class LongestPalindromicSubstring {

  private boolean isPalindromicSubstring(String s, int start, int end) {

    if (start >= end) {
      return false;
    }

    if (s.charAt(start) == s.charAt(end)) {
      if (end - start == 1 || end - start == 2) {
        return true;
      }
      return isPalindromicSubstring(s, start + 1, end - 1);
    }
    return false;
  }

  public String longestPalindrome(String s) {
    int length = s.length();

    for (int i = length; i > 1; i--) {
      for (int j = 0; j <= length - i; j++) {
        if (isPalindromicSubstring(s, j, i + j - 1)) {
          return s.substring(j, i + j);
        }
      }
    }
    return length == 0 ? "" : s.substring(0, 1);
  }

  // got failed by time limit exceeded(recursive method)
  Set<String> visited = new HashSet<>();

  public String timeLimitExceeded(String s) {

    if (visited.contains(s)) {
      return "";
    } else {
      visited.add(s);
    }

    int length = s.length();
    int midIndex = length / 2;
    boolean odd = length % 2 == 1;

    String left = s.substring(0, midIndex);
    String right = s.substring(midIndex);
    if (odd) {
      right = s.substring(midIndex + 1);
    }

    right = new StringBuilder(right).reverse().toString();
    if (left.equals(right)) {
      return s;
    } else {
      left = longestPalindrome(s.substring(0, length - 1));
      right = longestPalindrome(s.substring(1, length));
    }

    return left.length() > right.length() ? left : right;
  }
}
