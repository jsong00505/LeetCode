package hard.b;

import java.util.Stack;

/**
 * Created by jsong on 2019-05-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Hard - Basic Calculator (https://leetcode.com/problems/basic-calculator/)
 */
public class BasicCalculator {
  public int calculate(String s) {
    int result = 0;
    int sign = 1;
    int number = 0;
    Stack<Integer> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        number = 10 * number + (c - '0');
      } else if (c == '+') {
        result += sign * number;
        number = 0;
        sign = 1;
      } else if (c == '-') {
        result += sign * number;
        number = 0;
        sign = -1;
      } else if (c == '(') {
        stack.push(result);
        stack.push(sign);
        result = 0;
        sign = 1;
      } else if (c == ')') {
        result += sign * number;
        sign = stack.pop();
        result = stack.pop() + sign * result;
        number = 0;
        sign = 1;
      }
    }

    result += sign * number;

    return result;
  }
}
