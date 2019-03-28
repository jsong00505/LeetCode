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

  public boolean isMatch(String s, String p) {

    if (p.isEmpty()) {
      return s.isEmpty();
    }

    if (p.length() > 1 && p.charAt(1) == '*') {

      boolean firstMatch = false;
      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        firstMatch = true;
      }

      return (firstMatch && isMatch(s.substring(1), p)) || isMatch(s, p.substring(2));
    } else {
      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        return isMatch(s.substring(1), p.substring(1));
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
      if (s.length() == 0) {
        return true;
      }
      return false;
    } else {
      if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
        return isMatch(s.substring(1), p.substring(1));
      }
      return false;
    }
  }
}
