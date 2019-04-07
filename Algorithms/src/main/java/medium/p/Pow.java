package medium.p;

/**
 * Created by jsong on 2019-04-06.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Pow(x, n) (https://leetcode.com/problems/powx-n/)
 */
public class Pow {
  public double myPow(double x, int n) {
    long m = n > 0 ? n : ((long) n) * -1;
    double answer = 1.0;
    while (m != 0) {
      if ((m & 1) == 1) {
        answer *= x;
      }
      x *= x;
      m >>= 1;
    }
    return n > 0 ? answer : 1 / answer;
  }
}
