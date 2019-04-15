package easy.l;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Largest Rectangle in Histogram
 *     (https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/)
 */
public class LargestRectangleInHistogram {
  // 280ms too slow
  public int largestRectangleArea(int[] heights) {
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
