package hard.t;

/**
 * Created by jsong on 2019-04-02.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Trapping Rain Water (https://leetcode.com/problems/trapping-rain-water/)
 */
public class TrappingRainWater {
  public int trap(int[] height) {
    int sum = 0;
    int left = 0;
    int right = height.length - 1;
    int leftHighest = 0;
    int rightHighest = 0;
    while (left <= right) {
      if (leftHighest < rightHighest) {
        if (left == 0) {
          leftHighest = height[left];
        } else if (height[left] < leftHighest) {
          sum += leftHighest - height[left];
        } else if (height[left] > leftHighest) {
          leftHighest = height[left];
        }
        left++;
      } else {
        if (right == height.length - 1) {
          rightHighest = height[right];
        } else if (height[right] < rightHighest) {
          sum += rightHighest - height[right];
        } else if (height[right] > rightHighest) {
          rightHighest = height[right];
        }
        right--;
      }
    }
    return sum;
  }
}
