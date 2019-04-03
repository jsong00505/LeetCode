package medium.m;

/**
 * Created by jsong on 2019-04-02.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Multiply Strings (https://leetcode.com/problems/multiply-strings)
 */
public class MultiplyStrings {
  public String multiply(String num1, String num2) {
    StringBuilder result = new StringBuilder();
    int length = num1.length() + num2.length() - 1;
    int numberOfDigit = 1;
    int length1 = num1.length();
    int length2 = num2.length();
    int carry = 0;
    for (int i = 0; i < length; i++) {
      int x = 1;
      int y = numberOfDigit;
      int sum = 0;
      while (y > 0) {
        int index1 = length1 - 1 - (x - 1);
        int index2 = length2 - 1 - (y - 1);

        int n1 = index1 < 0 ? 0 : Character.getNumericValue(num1.charAt(index1));
        int n2 = index2 < 0 ? 0 : Character.getNumericValue(num2.charAt(index2));

        int multiply = n1 * n2;
        sum += multiply;

        x += 1;
        y -= 1;
      }
      sum += carry;
      carry = sum / 10;
      sum %= 10;
      numberOfDigit += 1;

      result.insert(0, sum);
    }

    if (carry != 0) {
      result.insert(0, carry);
    }

    return result.toString().startsWith("0") ? "0" : result.toString();
  }
}
