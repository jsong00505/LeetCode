package medium.s;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-04-13.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Subsets (https://leetcode.com/problems/subsets/)
 */
public class Subsets {

  // iteration
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    subsets.add(new ArrayList<>()); // empty subset

    for (int n : nums) {
      List<List<Integer>> tempSubsets = new ArrayList<>();
      for (List<Integer> subset : subsets) {
        List<Integer> tempSubset = new ArrayList<>(subset);
        tempSubset.add(n);
        tempSubsets.add(tempSubset);
      }
      subsets.addAll(tempSubsets);
    }
    return subsets;
  }

  // back tracking
  public List<List<Integer>> subsetsByBackTracking(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    backTracking(subsets, new ArrayList<>(), nums, 0);
    return subsets;
  }

  private void backTracking(
      List<List<Integer>> subsets, List<Integer> subset, int[] nums, int index) {
    subsets.add(new ArrayList<>(subset));

    for (int i = index; i < nums.length; i++) {
      subset.add(nums[i]);
      backTracking(subsets, subset, nums, i + 1);
      subset.remove(subset.size() - 1);
    }
  }
}
