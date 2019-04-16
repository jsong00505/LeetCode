package hard.m;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Minimum Window Substring
 *     (https://leetcode.com/problems/minimum-window-substring/)
 */
public class MinimumWindowSubstring {
  public String minWindow(String s, String t) {
    Map<Character, Integer> dictionaryOfT = new HashMap<>();
    for (char c : t.toCharArray()) {
      int count = dictionaryOfT.getOrDefault(c, 0);
      dictionaryOfT.put(c, count + 1);
    }
    int left = 0;
    int count = 0;
    int[] ans = new int[] {-1, 0, 0};
    for (int right = 0; right < s.length(); right++) {
      char r = s.charAt(right);
      if (dictionaryOfT.containsKey(r)) {
        dictionaryOfT.put(r, dictionaryOfT.get(r) - 1);
        if (dictionaryOfT.get(r) >= 0) {
          count++;
        }
      }

      while (count == t.length()) {
        int length = right - left + 1;
        int minLength = ans[0];
        if (minLength == -1 || minLength > length) {
          ans[0] = length;
          ans[1] = left;
          ans[2] = right + 1;
        }
        char l = s.charAt(left);
        if (dictionaryOfT.containsKey(l)) {
          dictionaryOfT.put(l, dictionaryOfT.get(l) + 1);
          if (dictionaryOfT.get(l) > 0) {
            count--;
          }
        }
        left++;
      }
    }

    return s.substring(ans[1], ans[2]);
  }
}
