package medium.d;

/**
 * Created by jsong on 2019-04-18.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Decode Ways (https://leetcode.com/problems/decode-ways/)
 */
public class DecodeWays {
  public int numDecodings(String s) {
    if (s == null || s.isEmpty() || s.charAt(0) == '0') {
      return 0;
    }

    int n = s.length();
    int[] decoder = new int[n + 1];
    decoder[n] = 1;
    decoder[n - 1] = s.charAt(n - 1) == '0' ? 0 : 1;

    for (int i = s.length() - 2; i >= 0; i--) {
      int prev = s.charAt(i + 1) - '0';
      int cur = s.charAt(i) - '0';
      int sum = cur * 10 + prev;
      if ((sum == 0) || (prev == 0 && (cur > 2 || cur < 0))) {
        return 0;
      }
      if (cur == 0) {
        decoder[i] = 0;
      } else if (sum <= 26 && sum >= 10) {
        decoder[i] = decoder[i + 1] + decoder[i + 2];
      } else {
        decoder[i] = decoder[i + 1];
      }
    }
    return decoder[0];
  }
}
