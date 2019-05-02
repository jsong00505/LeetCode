package easy.t;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jsong on 24/03/2019.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Easy - Two Sum(https://leetcode.com/problems/two-sum/)
 */
public class TwoSum {

  // use hash map and it is way faster than others
  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> rest = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      rest.put(target - nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      if (rest.containsKey(nums[i]) && rest.get(nums[i]) != i) {
        return new int[] {i, rest.get(nums[i])};
      }
    }
    return null;
  }

  public int[] twoSumByList(int[] nums, int target) {

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
