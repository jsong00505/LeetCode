package hard.l;

import java.util.Stack;

/**
 * Created by jsong on 2019-03-31.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Longest Valid Parentheses
 *     (https://leetcode.com/problems/longest-valid-parentheses/)
 */
public class LongestValidParentheses {
  public int longestValidParentheses(String s) {
    int begin = 0;
    int end = s.length() - 1;
    while (s.charAt(begin) != '(' && begin < end) {
      begin++;
    }
    while (s.charAt(end) != ')' && begin < end) {
      end--;
    }

    int longest = 0;
    while (longest < end - begin) {
      int length = validParentheses(s, begin, end);
      if (longest < length) {
        longest = length;
      }
      if (length == 0) {
        begin++;
        while (s.charAt(begin) != '(' && begin < end) {
          begin++;
        }
      }
      begin += length;
    }
    return longest;
  }

  private int validParentheses(String s, int begin, int end) {
    int index = begin;
    Stack<Character> stack = new Stack<>();

    int validCount = 0;
    while (index <= end) {

      if (s.charAt(begin) == ')') {
        stack.pop();
      } else {
        stack.push(')');
      }
      index++;
      if (stack.isEmpty()) {
        validCount = index - begin;
      }
    }

    return validCount;
  }
}
