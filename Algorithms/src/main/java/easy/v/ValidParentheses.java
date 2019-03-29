package easy.v;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (stack.isEmpty()) {
        stack.push(c);
      } else if (stack.peek() == getOpenBracket(c)) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    if (stack.isEmpty()) {
      return true;
    }

    return false;
  }

  private char getOpenBracket(char closeBracket) {
    switch (closeBracket) {
      case ')':
        return '(';
      case '}':
        return '{';
      case ']':
        return '[';
    }
    return ' ';
  }

  // my own solution is too slow(122 ms)
  List<Character> openBrackets = Arrays.asList('(', '{', '[');
  List<Character> closeBrackets = Arrays.asList(')', '}', ']');

  public boolean myOwnSolution(String s) {

    if (s.length() == 0) {
      return true;
    } else if (s.length() == 1) {
      return false;
    } else if (s.length() == 2) {
      char openBracket = s.charAt(0);
      char closeBracket = s.charAt(1);

      if (isValidOpenAndCloseBrackets(openBracket, closeBracket)) {
        return true;
      } else {
        return false;
      }
    }

    if (!openBrackets.contains(s.charAt(0))) {
      return false;
    }

    int countSameOpenBracket = 0;
    char openBracket = s.charAt(0);
    for (int i = 1; i < s.length(); i++) {
      char closeBracket = s.charAt(i);
      if (openBracket == closeBracket) {
        countSameOpenBracket++;
      }
      if (isValidOpenAndCloseBrackets(openBracket, closeBracket)) {
        if (countSameOpenBracket == 0) {
          return isValid(s.substring(1, i)) && isValid(s.substring(i + 1));
        } else {
          countSameOpenBracket--;
        }
      }
    }
    return false;
  }

  private boolean isValidOpenAndCloseBrackets(char openBracket, char closeBracket) {

    boolean validBrackets =
        openBrackets.contains(openBracket) && closeBrackets.contains(closeBracket);
    if (!validBrackets) {
      return false;
    }

    for (int i = 0; i < openBrackets.size(); i++) {
      if (openBracket == openBrackets.get(i)) {
        if (closeBracket == closeBrackets.get(i)) {
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }
}
