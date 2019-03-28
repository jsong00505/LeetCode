package medium.t;

import java.util.*;

/**
 * Created by jsong on 2019-03-27.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - 3Sum (https://leetcode.com/problems/3sum/)
 */
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {

      if (nums[i] > 0) {
        break;
      }

      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;
      int target = nums[i];
      while (left < right) {
        int sum = nums[left] + nums[right];
        if (left > i + 1 && nums[left] == nums[left - 1]) {
          left++;
        } else if (target + sum == 0) {
          result.add(Arrays.asList(target, nums[left], nums[right]));
          left++;
          right--;
        } else if (target + nums[left] + nums[right] > 0) {
          right--;
        } else {
          left++;
        }
      }
    }
    return result;
  }

  // time limit exceeded
  public List<List<Integer>> timeLimitExceeded(int[] nums) {

    // pre setup
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    List<List<Integer>> result = new ArrayList<>();
    for (int i : map.keySet()) {
      for (int j : map.keySet()) {
        int minusTwoSum = (-1) * (i + j);
        if (map.containsKey(minusTwoSum)) {
          if (i == 0 && j == 0 && map.get(0) < 3) {
            continue;
          }
          if ((i == j && map.get(i) < 2)
              || (i == minusTwoSum && map.get(i) < 2)
              || (j == minusTwoSum && map.get(j) < 2)) {
            continue;
          }
          List<Integer> sum = Arrays.asList(i, j, minusTwoSum);
          Collections.sort(sum);
          if (!result.contains(sum)) {
            result.add(sum);
          }
        }
      }
    }

    return result;
  }
}
