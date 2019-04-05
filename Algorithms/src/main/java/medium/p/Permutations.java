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
 * @challenge Medium - Permutations (https://leetcode.com/problems/permutations/)
 */
public class Permutations {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> permutations = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    backTracking(nums, permutations, new ArrayList<>(), used);
    return permutations;
  }

  private void backTracking(
      int[] nums, List<List<Integer>> permutations, List<Integer> permutation, boolean[] used) {
    if (permutation.size() == nums.length) {
      permutations.add(permutation);
    }

    for (int i = 0; i < nums.length; i++) {
      if (!used[i]) {
        boolean[] copyUsed = Arrays.copyOf(used, used.length);
        copyUsed[i] = true;
        List<Integer> copyPermutation = new ArrayList<>(permutation);
        copyPermutation.add(nums[i]);
        backTracking(nums, permutations, copyPermutation, copyUsed);
      }
    }
  }
}
