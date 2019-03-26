package easy.t;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 24/03/2019.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Two Sum(https://leetcode.com/problems/two-sum/)
 */
public class TwoSum {

  /**
   * To retrieve the indices of the two numbers such that they add up to a specific target.
   *
   * @param nums an array of integers
   * @param target sum of the two numbers in nums
   * @return indices of the two numbers such that they add up to a specific target. If there is no
   *     valid indices it will return null.
   */
  public int[] twoSum(int[] nums, int target) {

    List<Integer> restOfTarget = new ArrayList<>();
    int numsSize = nums.length;
    for (int i = 0; i < numsSize; i++) {
      if (restOfTarget.contains(nums[i])) {
        return new int[] {restOfTarget.indexOf(nums[i]), i};
      }
      restOfTarget.add(target - nums[i]);
    }
    return null;
  }

  // O(N^2)
  public int[] twoSumN2(int[] nums, int target) {

    int numsSize = nums.length;
    for (int i = 0; i < numsSize - 1; i++) {
      for (int j = i + 1; j < numsSize; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return null;
  }
}
