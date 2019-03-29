package medium.g;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-03-28.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Generate Parentheses (https://leetcode.com/problems/generate-parentheses/)
 */
public class GenerateParentheses {
  char openBracket = '(';
  char closeBracket = ')';

  public List<String> generateParenthesis(int n) {
    List<String> parentheses = new ArrayList<>();
    backTracking(parentheses, new StringBuilder(), n, n, n);
    return parentheses;
  }

  private void backTracking(
      List<String> parenthesisList, StringBuilder parenthesis, int n, int open, int close) {
    if (parenthesis.length() == n * 2) {
      parenthesisList.add(parenthesis.toString());
    } else if (parenthesis.length() == (n * 2) - 1 && open > 0) {
      return;
    } else if (parenthesis.length() == (n * 2) - 2 && open > 1) {
      return;
    }

    if (open > 0) {
      StringBuilder addOpenBracket = new StringBuilder();
      addOpenBracket.append(parenthesis).append(openBracket);
      backTracking(parenthesisList, addOpenBracket, n, open - 1, close);
    }

    if (close > 0 && open < close) {
      StringBuilder addCloseBracket = new StringBuilder();
      addCloseBracket.append(parenthesis).append(closeBracket);
      backTracking(parenthesisList, addCloseBracket, n, open, close - 1);
    }
  }
}
