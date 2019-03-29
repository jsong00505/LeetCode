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
 * @challenge Medium - Letter Combinations of a Phone Number (https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */
public class LetterCombinationsPhoneNumber {

  String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    backTracking(result, digits, new StringBuilder(), 0);
    return result;
  }

  private void backTracking(
          List<String> result,
          String digits,
          StringBuilder subLetters,
          int index) {
    if (index == digits.length()) {
      result.add(subLetters.toString());
      return;
    }

    int digit = Character.getNumericValue(digits.charAt(index));
    String letterSet = letters[digit];
    index++;

    for (char c : letterSet.toCharArray()) {
      StringBuilder newSubLetter = new StringBuilder();
      newSubLetter.append(subLetters).append(c);
      backTracking(result, digits, newSubLetter, index);
    }
  }

  // This is my own solution without back tracking
  public List<String> myOwnSolution(String digits) {

    int total = 1;
    for (char c : digits.toCharArray()) {
      int num = Character.getNumericValue(c);
      total *= letters[num].length();
    }

    List<StringBuilder> tempResult = new ArrayList<>();
    int changer = 1;
    for (char c : digits.toCharArray()) {
      int num = Character.getNumericValue(c);
      int divider = total / letters[num].length() / changer;
      int letterIndex = 0;
      for (int i = 0; i < total; i++) {
        if (i != 0 && i % divider == 0) {
          letterIndex++;
        }

        if (letterIndex == letters[num].length()) {
          letterIndex = 0;
        }
        char d = letters[num].charAt(letterIndex);

        if (tempResult.size() != total) {
          StringBuilder sb = new StringBuilder();
          sb.append(d);
          tempResult.add(sb);
        } else {
          tempResult.get(i).append(d);
        }
      }
      changer *= letters[num].length();
    }

    List<String> result = new ArrayList<>();
    for (StringBuilder sb : tempResult) {
      result.add(sb.toString());
    }
    return result;
  }
}