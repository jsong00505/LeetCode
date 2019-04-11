package easy.p;

import java.util.Arrays;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Plus One (https://leetcode.com/problems/plus-one/)
 */
public class PlusOne {
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }

    int[] newDigits = new int[digits.length + 1];
    Arrays.fill(newDigits, 0);
    newDigits[0] = 1;
    return newDigits;
  }

  // my own solution
  public int[] plusOneByCarry(int[] digits) {
    int len = digits.length;
    int carry = 1;
    while (len > 0 && carry == 1) {
      if (digits[len - 1] == 9) {
        digits[len - 1] = 0;
        carry = 1;
      } else {
        digits[len - 1]++;
        carry = 0;
      }
      len--;
    }
    int[] result = digits;
    if (carry == 1) {
      len = digits.length;
      result = new int[len + 1];
      result[0] = 1;
      for (int i = 1; i < len + 1; i++) {
        result[i] = digits[i - 1];
      }
    }

    return result;
  }
}
