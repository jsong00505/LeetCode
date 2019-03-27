package medium.c;

/**
 * Created by jsong on 2019-03-26.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Container With Most Water
 *     (https://leetcode.com/problems/container-with-most-water/)
 */
public class ContainerWithMostWater {

  // slightly better than brute force
  public int maxArea(int[] height) {

    int max = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      // calculate area
      int length = Math.min(height[left], height[right]);
      int width = right - left;
      int area = length * width;

      // set max area
      if (max < area) {
        max = area;
      }

      // move cursor to the middle
      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }
    return max;
  }

  // brute force method - got passed but it is too slow(143ms)
  public int tooSlow(int[] height) {
    int max = 0;
    int highst = 0;
    for (int i = 0; i < height.length; i++) {
      if (highst < height[i]) {
        highst = height[i];
        for (int j = i + 1; j < height.length; j++) {
          int length = Math.min(height[i], height[j]);
          int width = Math.abs(i - j);
          int area = length * width;
          if (area > max) {
            max = area;
          }
        }
      }
    }
    return max;
  }
}
