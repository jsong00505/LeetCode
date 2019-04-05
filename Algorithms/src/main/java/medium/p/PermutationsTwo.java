package medium.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsong on 2019-04-04.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Permutations II (https://leetcode.com/problems/permutations-ii/)
 */
public class PermutationsTwo {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> permutations = new ArrayList<>();
    backTracking(nums, permutations, new ArrayList<>(), new boolean[nums.length]);
    return permutations;
  }

  public void backTracking(
      int[] nums, List<List<Integer>> permutations, List<Integer> permutation, boolean[] used) {
    if (permutation.size() == nums.length) {
      permutations.add(new ArrayList<>(permutation));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (used[i]) {
        continue;
      }
      if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
        continue;
      }
      used[i] = true;
      permutation.add(nums[i]);
      backTracking(nums, permutations, permutation, used);
      used[i] = false;
      permutation.remove(permutation.size() - 1);
    }
  }

  // tried different method with permutations but too slow(25ms)
  public List<List<Integer>> tooSlowContains(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> permutations = new ArrayList<>();
    permutations.add(new ArrayList<>());
    for (int i = 0; i < nums.length; i++) {
      List<List<Integer>> newPermutations = new ArrayList<>();
      for (List<Integer> permutation : permutations) {
        for (int j = 0; j <= i; j++) {
          List<Integer> copyPermutation = new ArrayList<>(permutation);
          copyPermutation.add(j, nums[i]);
          if (!newPermutations.contains(copyPermutation)) {
            newPermutations.add(copyPermutation);
          }
        }
      }
      permutations = newPermutations;
    }

    return permutations;
  }
}
