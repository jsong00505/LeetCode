package hard.r;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Regular Expression Matching
 *     (https://leetcode.com/problems/regular-expression-matching/)
 */
public class RegularExpressionMatching {

  // use dp
  public boolean isMatch(String s, String p) {
    boolean[][] match = new boolean[s.length() + 1][p.length() + 1];

    // init
    match[0][0] = true;

    // dp[0][j] can be true depends on the previous pattern
    for (int j = 2; j <= p.length(); j++) {
      if (p.charAt(j - 1) == '*') {
        match[0][j] = match[0][j - 2];
      }
    }

    for (int i = 1; i <= s.length(); i++) {
      for (int j = 1; j <= p.length(); j++) {
        char currentCharacter = s.charAt(i - 1);
        char currentPattern = p.charAt(j - 1);
        if (currentCharacter == currentPattern || currentPattern == '.') {
          match[i][j] = match[i - 1][j - 1];
        } else if (j > 1 && currentPattern == '*') {
          char previousPattern = p.charAt(j - 2);
          if (previousPattern != currentCharacter && previousPattern != '.') {
            match[i][j] = match[i][j - 2];
          } else {
            match[i][j] = match[i][j - 2] || match[i - 1][j - 1] || match[i - 1][j];
          }
        }
      }
    }

    return match[s.length()][p.length()];
  }

  // recursion
  public boolean recursion(String s, String p) {

    if (p.isEmpty()) {
      return s.isEmpty();
    }

    if (p.length() > 1 && p.charAt(1) == '*') {

      boolean firstMatch = false;
      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        firstMatch = true;
      }

      return (firstMatch && recursion(s.substring(1), p)) || recursion(s, p.substring(2));
    } else {
      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        return recursion(s.substring(1), p.substring(1));
      }
      return false;
    }
  }

  // time limit exceeded
  public boolean timeLimitedExceeded(String s, String p) {

    if (p.isEmpty()) {
      return s.isEmpty();
    }

    if (p.length() > 1 && p.charAt(1) == '*') {

      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        if (p.length() > 2) {
          return isMatch(s.substring(1), p)
              || isMatch(s.substring(1), p.substring(2))
              || isMatch(s, p.substring(2));
        }
        return isMatch(s.substring(1), p);
      }
      if (p.length() > 2) {
        return isMatch(s, p.substring(2));
      }
      return s.length() == 0;
    } else {
      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        return isMatch(s.substring(1), p.substring(1));
      }
      return false;
    }
  }
}
