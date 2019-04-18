package medium.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsong on 2019-04-17.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Subsets II (https://leetcode.com/problems/subsets-ii/)
 */
public class SubsetsTwo {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    Arrays.sort(nums);
    List<List<Integer>> subsets = new ArrayList<>();
    subsets.add(new ArrayList<>());
    subsets.add(Arrays.asList(nums[0]));

    int previousSize = 1;

    for (int i = 1; i < nums.length; i++) {
      int size = subsets.size();
      if (nums[i] != nums[i - 1]) {
        previousSize = size;
      }

      for (int j = size - previousSize; j < size; j++) {
        List<Integer> tempSubset = new ArrayList<>(subsets.get(j));
        tempSubset.add(nums[i]);
        subsets.add(tempSubset);
      }
    }

    return subsets;
  }

  public List<List<Integer>> myOwnSolution(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    Arrays.sort(nums);
    List<List<Integer>> subsets = new ArrayList<>();
    subsets.add(new ArrayList<>());
    subsets.add(Arrays.asList(nums[0]));

    List<List<Integer>> previousSubsets = new ArrayList<>();
    previousSubsets.add(Arrays.asList(nums[0]));

    for (int i = 1; i < nums.length; i++) {
      List<List<Integer>> tempSubsets = new ArrayList<>();
      if (nums[i] == nums[i - 1]) {
        for (List<Integer> subset : previousSubsets) {
          List<Integer> tempSubset = new ArrayList<>(subset);
          tempSubset.add(nums[i]);
          tempSubsets.add(tempSubset);
        }
      } else {
        for (List<Integer> subset : subsets) {
          List<Integer> tempSubset = new ArrayList<>(subset);
          tempSubset.add(nums[i]);
          tempSubsets.add(tempSubset);
        }
      }
      subsets.addAll(tempSubsets);
      previousSubsets = new ArrayList<>(tempSubsets);
    }

    return subsets;
  }
}
