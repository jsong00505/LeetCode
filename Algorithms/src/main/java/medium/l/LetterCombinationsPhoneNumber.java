package medium.l;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-03-27.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Letter Combinations of a Phone Number
 *     (https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */
public class LetterCombinationsPhoneNumber {
  public List<String> letterCombinations(String digits) {
    String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    int total = 1;
    for (char c : digits.toCharArray()) {
      int num = Character.getNumericValue(c);
      total *= letters[num - 2].length();
    }

    List<StringBuilder> tempResult = new ArrayList<>();
    int changer = 1;
    for (char c : digits.toCharArray()) {
      int num = Character.getNumericValue(c);
      int divider = total / letters[num - 2].length() / changer;
      int letterIndex = 0;
      for (int i = 0; i < total; i++) {
        if (i != 0 && i % divider == 0) {
          letterIndex++;
        }

        if (letterIndex == letters[num - 2].length()) {
          letterIndex = 0;
        }
        char d = letters[num - 2].charAt(letterIndex);

        if (tempResult.size() != total) {
          StringBuilder sb = new StringBuilder();
          sb.append(d);
          tempResult.add(sb);
        } else {
          tempResult.get(i).append(d);
        }
      }
      changer *= letters[num - 2].length();
    }

    List<String> result = new ArrayList<>();
    for (StringBuilder sb : tempResult) {
      result.add(sb.toString());
    }
    return result;
  }
}
