package hard.l;

import java.util.Stack;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Largest Rectangle in Histogram (https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/)
 */
public class LargestRectangleInHistogram {


  // using stack and found the solution from geeksforgeeks
  public int largestRectangleArea(int[] heights) {

    Stack<Integer> s = new Stack<>();
    int largestArea = 0;

    int i = 0;
    while (i <= heights.length) {
      int height = i == heights.length ? 0 : heights[i];
      if (s.isEmpty() || heights[s.peek()] <= height) {
        s.push(i++);
      } else {
        int largerHeight = heights[s.peek()];
        s.pop();
        int width = s.isEmpty() ? i : (i - s.peek() - 1);
        int area = largerHeight * width;
        if (largestArea < area) {
          largestArea = area;
        }
      }
    }
    return largestArea;
  }

  // 280ms too slow
  public int largestRectangleAreaByMine(int[] heights) {
    int largest = 0;
    for (int i = 0; i < heights.length; i++) {
      int left = i;
      int right = i + 1;
      while (left >= 0 && heights[left] >= heights[i]) {
        left--;
      }
      while (right < heights.length && heights[right] >= heights[i]) {
        right++;
      }
      left++;
      int rectangle = heights[i] * (right - left);
      if (rectangle > largest) {
        largest = rectangle;
      }
    }

    return largest;
  }
}
