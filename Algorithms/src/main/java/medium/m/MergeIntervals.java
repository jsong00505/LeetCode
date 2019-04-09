package medium.m;

import common.Interval;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * Created by jsong on 2019-04-08.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Merge Intervals (https://leetcode.com/problems/merge-intervals/)
 */
public class MergeIntervals {
  // O(n * logn) because of sorting
  public List<Interval> merge(List<Interval> intervals) {
    intervals.sort(Comparator.comparingInt(i -> i.start));
    Stack<Interval> stack = new Stack<>();

    for (Interval interval : intervals) {
      if (!stack.isEmpty()) {
        Interval previous = stack.pop();
        if (interval.end >= previous.start && previous.end >= interval.start) {
          interval.start = Math.min(previous.start, interval.start);
          interval.end = Math.max(previous.end, interval.end);
        } else {
          stack.push(previous);
        }
      }
      stack.push(interval);
    }
    return stack;
  }
}
