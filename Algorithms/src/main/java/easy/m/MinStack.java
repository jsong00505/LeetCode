package easy.m;

import java.util.Stack;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Easy - Min Stack (https://leetcode.com/problems/min-stack/)
 */
public class MinStack {

  private Stack<Integer> stack;
  private int min = Integer.MAX_VALUE;

  public MinStack() {
    stack = new Stack<>();
  }

  public void push(int x) {
    if (min >= x) {
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public void pop() {
    int pop = stack.pop();
    if (pop == min) {
      min = stack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }
}
