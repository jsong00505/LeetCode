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
 * @challenge Medium - Combination Sum II (https://leetcode.com/problems/combination-sum-ii/)
 */
public class CombinationSumTwo {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> combinations = new ArrayList<>();
    backTracking(combinations, new ArrayList<>(), candidates, target, 0);
    return combinations;
  }

  /**
   * Do back tracking to retrieve combinations of candidates up to specific target.
   *
   * @param combinations The combinations to be returned
   * @param combination The one of the combinations
   * @param candidates The candidates to be a part of the combinations
   * @param target The target to hit the combination of the candidates
   * @param begin The begin index to be started to make the combinations
   */
  private void backTracking(
      List<List<Integer>> combinations,
      List<Integer> combination,
      int[] candidates,
      int target,
      int begin) {
    for (int i = begin; i < candidates.length; i++) {
      if (i > begin && candidates[i] == candidates[i - 1]) {
        continue;
      }
      if (target == candidates[i]) {
        combination.add(candidates[i]);
        combinations.add(combination);
        break;
      } else if (target > candidates[i]) {
        List<Integer> copy = new ArrayList<>(combination);
        copy.add(candidates[i]);
        backTracking(combinations, copy, candidates, target - candidates[i], i + 1);
      } else {
        break;
      }
    }
  }
}
