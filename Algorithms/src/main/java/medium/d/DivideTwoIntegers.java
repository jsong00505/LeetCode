package medium.d;

/**
 * Created by jsong on 2019-03-31.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Divide Two Integers (https://leetcode.com/problems/divide-two-integers/)
 */
public class DivideTwoIntegers {
  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }
    boolean sign = dividend < 0 == divisor < 0;
    dividend = dividend < 0 ? dividend : -dividend;
    divisor = divisor < 0 ? divisor : -divisor;
    int quotient = div(dividend, divisor);
    return sign ? quotient : -quotient;
  }

  private int div(int dividend, int divisor) {
    int total = divisor, result = 0, prev = 0;

    while (dividend <= total) {
      result = result == 0 ? 1 : result + result;
      prev = total;
      total += total;
      // overflow
      if (total > prev) {
        break;
      }
    }
    return result == 0 ? result : result + div(dividend - prev, divisor);
  }
}
