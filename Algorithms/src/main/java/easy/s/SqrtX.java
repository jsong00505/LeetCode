package easy.s;

/**
 * Created by jsong on 2019-04-11.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Sqrt(x) (https://leetcode.com/problems/sqrtx/)
 */
public class SqrtX {

  // binary search
  public int mySqrt(int x) {
    if (x == 0) return 0;
    int left = 1, right = Integer.MAX_VALUE;
    while (true) {
      int mid = left + (right - left) / 2;
      if (mid > x / mid) {
        right = mid - 1;
      } else {
        if (mid + 1 > x / (mid + 1)) return mid;
        left = mid + 1;
      }
    }
  }

  // my own solution
  public int myOwnSoltuion(int x) {
    long max = (long) Math.pow(2, 16);
    long a = max < x ? max : x;

    while (a * a >= x && x > 1) {
      a /= 2;
    }
    while (a * a <= x) {
      a++;
    }
    return (int) a - 1;
  }
}
