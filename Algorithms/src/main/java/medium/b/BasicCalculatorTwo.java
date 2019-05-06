package medium.b;

import java.util.Stack;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Basic Calculator II (https://leetcode.com/problems/basic-calculator-ii/)
 */
public class BasicCalculatorTwo {
  public int calculate(String s) {
    int num = 0;
    char sign = '+';
    Stack<Integer> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        num = num * 10 + c - '0';
      } else if (c != ' ') {
        helper(stack, sign, num);
        sign = c;
        num = 0;
      }
    }

    helper(stack, sign, num);

    int result = 0;
    for (int i : stack) {
      result += i;
    }
    return result;
  }

  private void helper(Stack<Integer> stack, int sign, int num) {
    if (sign == '+') {
      stack.push(num);
    } else if (sign == '-') {
      stack.push(-num);
    } else if (sign == '*') {
      stack.push(stack.pop() * num);
    } else if (sign == '/') {
      stack.push(stack.pop() / num);
    }
  }
}
