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

  // dp
  public int longestValidParentheses(String s) {
    int[] dp = new int[s.length()];
    int longest = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == ')') {
        int prev = i - dp[i - 1] - 1;
        if (prev >= 0 && s.charAt(prev) == '(') {
          dp[i] = dp[i - 1] + 2;
          if (prev - 1 >= 0) {
            dp[i] += dp[prev - 1];
          }
        }
      }
      longest = Math.max(dp[i], longest);
    }
    return longest;
  }

  // stack
  public int longestValidParenthesesByStack(String s) {

    int longest = 0;
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.isEmpty()) {
          stack.push(i);
        } else {
          longest = Math.max(i - stack.peek(), longest);
        }
      }
    }
    return longest;
  }

  // left-right solution
  public int leftAndRight(String s) {

    // result
    int longest = 0;

    // number of open/close bracket
    int open = 0;
    int close = 0;

    // search left to right
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ')') {
        // if the number of open bracket is smaller than close one the parentheses are not valid
        // "())"
        // "()())"
        if (open <= close) {
          open = 0;
          close = 0;
        } else {
          close = close + 1;
        }
      } else {
        open++;
      }
      if (open == close) {
        longest = Math.max(longest, open);
      }
    }

    // search right to left
    open = 0;
    close = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      // if the number of close bracket is smaller than open one the parentheses are not valid
      // "(()"
      // "(()()"
      if (s.charAt(i) == '(') {
        if (close <= open) {
          open = 0;
          close = 0;
        } else {
          open = open + 1;
        }
      } else {
        close++;
      }
      if (open == close) {
        longest = Math.max(longest, open);
      }
    }

    return longest * 2;
  }

  // my own solution but too slow
  public int myOwnSolution(String s) {
    int begin = 0;
    int end = s.length() - 1;
    while (begin < end && s.charAt(begin) != '(') {
      begin++;
    }
    while (begin < end && s.charAt(end) != ')') {
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

      } else {
        begin += length;
      }

      while (begin < end && s.charAt(begin) != '(') {
        begin++;
      }
    }
    return longest;
  }

  private int validParentheses(String s, int begin, int end) {
    int index = begin;
    Stack<Character> stack = new Stack<>();

    int validCount = 0;
    while (index <= end) {

      if (s.charAt(index) == ')') {
        stack.pop();
      } else {
        stack.push('(');
      }
      index++;
      if (stack.isEmpty()) {
        validCount = index - begin;
        if (index <= end && s.charAt(index) == ')') {
          break;
        }
      }
    }

    return validCount;
  }
}
