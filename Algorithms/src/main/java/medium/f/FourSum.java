package medium.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsong on 2019-03-28.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - 4Sum(https://leetcode.com/problems/4sum/)
 */
public class FourSum {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 3; i++) {

      if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
        break;
      }

      if (i != 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      for (int j = i + 1; j < nums.length - 2; j++) {

        if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
          break;
        }

        if (j != i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }

        int left = j + 1;
        int right = nums.length - 1;

        while (left < right) {
          int fourSum = nums[i] + nums[j] + nums[left] + nums[right];

          if (left != j + 1 && nums[left] == nums[left - 1]) {
            left++;
          } else if (fourSum == target) {
            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            left++;
            right--;
          } else if (fourSum > target) {
            right--;
          } else {
            left++;
          }
        }
      }
    }

    return result;
  }
}
