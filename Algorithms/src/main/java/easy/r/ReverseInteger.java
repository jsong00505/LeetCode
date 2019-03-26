package easy.r;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - ReverseInteger(https://leetcode.com/problems/reverse-integer)
 */
public class ReverseInteger {
  public int reverse(int x) {

    boolean negative = x <= 0;

    if (negative) {
      x *= -1;
    }

    Double result = 0.0;
    while (x > 0) {
      int temp = x % 10;
      result = result * 10 + temp;
      x /= 10;
    }

    if (negative) {
      result *= -1;
    }

    // check overflow
    double min = Math.pow(2, 31) * -1;
    double max = Math.pow(2, 31) - 1;
    if (result < min || result > max) {
      return 0;
    }

    return result.intValue();
  }
}
