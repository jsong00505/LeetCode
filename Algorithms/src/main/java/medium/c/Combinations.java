package medium.c;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Combinations (https://leetcode.com/problems/combinations/)
 */
public class Combinations {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> combinations = new ArrayList<>();
    backTracking(combinations, new ArrayList<>(), 1, n, k);
    return combinations;
  }

  public void backTracking(
      List<List<Integer>> combinations, List<Integer> combination, int index, int n, int k) {
    if (combination.size() == k) {
      combinations.add(new ArrayList<>(combination));
    }

    for (int i = index; i <= n; i++) {
      combination.add(i);
      backTracking(combinations, combination, i + 1, n, k);
      combination.remove(combination.size() - 1);
    }
  }
}
