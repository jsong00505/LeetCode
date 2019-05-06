package medium.i;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Interval List Intersections
 *     (https://leetcode.com/problems/interval-list-intersections/)
 */
public class IntervalListIntersections {
  public int[][] intervalIntersection(int[][] A, int[][] B) {
    int a = 0;
    int b = 0;
    List<int[]> result = new ArrayList<>();
    while (a < A.length && b < B.length) {
      int lo = Math.max(A[a][0], B[b][0]);
      int hi = Math.min(A[a][1], B[b][1]);
      if (lo <= hi) {
        result.add(new int[] {lo, hi});
      }
      if (A[a][1] < B[b][1]) {
        a++;
      } else {
        b++;
      }
    }
    return result.toArray(new int[result.size()][2]);
  }
}
