package medium.t;

import java.util.Arrays;

/**
 * Created by jsong on 2019-03-27.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - 3Sum Closest (https://leetcode.com/problems/3sum-closest/)
 */
public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {

    Arrays.sort(nums);

    // init - supposed to have the number of nums is over at least 3
    int closest = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      int smallestNum = nums[i];
      while (left < right) {
        int threeSum = smallestNum + nums[left] + nums[right];
        if (left > i + 1 && nums[left] == nums[left - 1]) {
          left++;
          continue;
        }
        if (Math.abs(threeSum - target) < Math.abs(closest - target)) {
          closest = threeSum;
        }

        if (threeSum > target) {
          right--;
        } else {
          left++;
        }

        if (closest == target) {
          break;
        }
      }
    }
    return closest;
  }
}
