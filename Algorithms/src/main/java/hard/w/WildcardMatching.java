package hard.w;

/**
 * Created by jsong on 2019-04-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Wildcard Matching (https://leetcode.com/problems/wildcard-matching)
 */
public class WildcardMatching {
  private char QUESTION = '?';
  private char ASTERISK = '*';

  public boolean isMatch(String str, String pattern) {
    boolean[][] dp = new boolean[str.length() + 1][pattern.length() + 1];
    dp[0][0] = true;

    for (int i = 0; i < pattern.length(); i++) {
      if (pattern.charAt(i) == ASTERISK) {
        dp[0][i + 1] = true;
      } else {
        break;
      }
    }
    for (int i = 1; i <= str.length(); i++) {
      for (int j = 1; j <= pattern.length(); j++) {
        char s = str.charAt(i - 1);
        char p = pattern.charAt(j - 1);
        if (p == QUESTION || p == s) {
          dp[i][j] = dp[i - 1][j - 1];
        } else if (p == ASTERISK) {
          dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
        }
      }
    }
    return dp[str.length()][pattern.length()];
  }
}
