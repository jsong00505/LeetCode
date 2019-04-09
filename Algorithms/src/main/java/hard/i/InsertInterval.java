package hard.i;

import common.Interval;

import java.util.*;

/**
 * Created by jsong on 2019-04-08.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Insert Interval (https://leetcode.com/problems/insert-interval/)
 */
public class InsertInterval {
  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    if (intervals.size() == 0) {
      return Collections.singletonList(newInterval);
    }
    Stack<Interval> stack = new Stack<>();
    int i = 0;
    boolean inserted = false;
    while (i < intervals.size()) {
      Interval current = intervals.get(i);
      if (current.start >= newInterval.start && !inserted) {
        current = newInterval;
        i--;
        inserted = true;
      }

      merge(stack, current);
      i++;
    }

    if (!inserted) {
      merge(stack, newInterval);
    }

    return stack;
  }

  private void merge(Stack<Interval> stack, Interval current) {
    if (!stack.isEmpty()) {
      Interval previous = stack.pop();
      if (previous.end >= current.start) {
        current.start = previous.start;
        current.end = Math.max(previous.end, current.end);
      } else {
        stack.push(previous);
      }
    }
    stack.push(current);
  }
}
