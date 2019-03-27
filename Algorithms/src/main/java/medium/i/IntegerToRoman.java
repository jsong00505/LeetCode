package medium.i;

import java.util.HashMap;

/**
 * Created by jsong on 2019-03-26.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Integer to Roman (https://leetcode.com/problems/integer-to-roman/)
 */
public class IntegerToRoman {

  // much faster
  public String intToRoman(int num) {
    // preset roman symbols
    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    StringBuilder roman = new StringBuilder();
    int i = 0;
    while (num > 0) {
      int rest = num / nums[i];
      for (int j = 0; j < rest; j++) {
        roman.append(symbols[i]);
      }
      num -= nums[i] * rest;
      i++;
    }

    return roman.toString();
  }

  public String intToRoman2(int num) {

    // preset roman symbols
    HashMap<Integer, String> romanSymbol = new HashMap<>();
    romanSymbol.put(1, "I");
    romanSymbol.put(5, "V");
    romanSymbol.put(10, "X");
    romanSymbol.put(50, "L");
    romanSymbol.put(100, "C");
    romanSymbol.put(500, "D");
    romanSymbol.put(1000, "M");

    StringBuilder roman = new StringBuilder();
    int divider = 1;
    while (num > 0) {
      StringBuilder temp = new StringBuilder();
      int digit = num % 10;
      if (digit == 4 || digit == 9) {
        temp.append(romanSymbol.get(divider));
        temp.append(romanSymbol.get((digit + 1) * divider));
      } else if (digit >= 5) {
        temp.append(romanSymbol.get(5 * divider));
        digit -= 5;
        while (digit > 0) {
          temp.append(romanSymbol.get(divider));
          digit--;
        }
      } else {
        while (digit > 0) {
          temp.append(romanSymbol.get(divider));
          digit--;
        }
      }
      roman.insert(0, temp);
      divider *= 10;
      num /= 10;
    }
    return roman.toString();
  }
}
