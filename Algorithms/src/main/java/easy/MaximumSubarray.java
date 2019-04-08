package easy;

import java.util.Stack;

/**
 * Created by jsong on 2019-04-07.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
 */
public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    int result = nums.length == 0 ? 0 : nums[0];
    int previous = result;
    for (int i = 1; i < nums.length; i++) {
      int n = nums[i];
      previous = Math.max(previous + n, n);
      result = Math.max(previous, result);
    }
    return result;
  }
}
