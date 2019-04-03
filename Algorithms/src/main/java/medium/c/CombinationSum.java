package medium.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsong on 2019-04-02.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Combination Sum (https://leetcode.com/problems/combination-sum/)
 */
public class CombinationSum {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> combinations = new ArrayList<>();
    backTracking(combinations, new ArrayList<>(), candidates, 0, 0, target);
    return combinations;
  }

  /**
   * For retrieving all available combinations, do back tracking
   *
   * @param combinations the answer of the problem
   * @param combination one candidate of the combination
   * @param candidates the list of candidates
   * @param begin the begin index to back tracking
   * @param sum the sum value in the combination
   * @param target the target value by combination
   */
  private void backTracking(
      List<List<Integer>> combinations,
      List<Integer> combination,
      int[] candidates,
      int begin,
      int sum,
      int target) {

    for (int i = begin; i < candidates.length; i++) {
      if (sum + candidates[i] == target) {
        combination.add(candidates[i]);
        combinations.add(combination);
      } else if (sum + candidates[i] < target) {
        List<Integer> copyCombination = new ArrayList<>(combination);
        copyCombination.add(candidates[i]);
        backTracking(combinations, copyCombination, candidates, i, sum + candidates[i], target);
      }
    }
  }
}
