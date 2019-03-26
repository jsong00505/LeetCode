package medium.s;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - String To Integer (atoi)
 *     (https://leetcode.com/problems/string-to-integer-atoi/)
 */
public class StringToIntegerAtoi {
  public int myAtoi(String str) {

    str = str.trim();

    if (str.isEmpty() || (str.length() == 1 && (str.equals("-") || str.equals("+")))) {
      return 0;
    }

    char firstCharacter = str.charAt(0);
    boolean negative = false;
    if (firstCharacter == '-') {
      negative = true;
      firstCharacter = str.charAt(1);
      str = str.substring(1);
    } else if (firstCharacter == '+') {
      firstCharacter = str.charAt(1);
      str = str.substring(1);
    }

    int num0 = '0';
    int num9 = '9';
    if (firstCharacter < num0 || firstCharacter > num9) {
      return 0;
    }

    Double result = 0.0;
    for (char c : str.toCharArray()) {
      if (c < num0 || c > num9) {
        break;
      }
      result = result * 10 + Character.getNumericValue(c);
    }

    if (negative) {
      result *= -1;
    }

    double max = Math.pow(2, 31) - 1;
    double min = Math.pow(2, 31) * (-1);
    result = result > max ? max : result;
    result = result < min ? min : result;

    return result.intValue();
  }
}
