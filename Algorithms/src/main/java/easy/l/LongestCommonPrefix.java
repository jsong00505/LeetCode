package easy.l;

/**
 * Created by jsong on 2019-03-26.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Longest Common Prefix (https://leetcode.com/problems/longest-common-prefix/)
 */
public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {

    StringBuilder result = new StringBuilder();

    if (strs.length == 0) {
      return result.toString();
    }

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (String str : strs) {
        if (str.length() <= i || str.charAt(i) != c) {
          return result.toString();
        }
      }
      result.append(c);
    }

    return result.toString();
  }
}
