package medium.p;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Permutation Sequence (https://leetcode.com/problems/permutations-sequence/)
 */
public class PermutationSequence {

  public String getPermutation(int n, int k) {
    if (n < 1) {
      return "";
    }
    int[] factorial = new int[n];
    List<Integer> numbers = new ArrayList<>();
    factorial[0] = 1;
    numbers.add(1);
    for (int i = 1; i < n; i++) {
      numbers.add(i + 1);
      factorial[i] = i * factorial[i - 1];
    }

    --k;
    StringBuilder permutation = new StringBuilder();
    for (int i = n; i > 0; i--) {
      int time = k / factorial[i - 1];
      permutation.append(numbers.get(time));
      numbers.remove(time);
      k = k - time * factorial[i - 1];
    }

    return permutation.toString();
  }
}
