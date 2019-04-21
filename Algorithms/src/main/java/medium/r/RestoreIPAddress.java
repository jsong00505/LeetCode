package medium.r;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-04-20.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Restore IP Address (https://leetcode.com/problems/restore-ip-address/)
 */
public class RestoreIPAddress {

  List<String> addresses;

  public List<String> restoreIpAddresses(String s) {
    addresses = new ArrayList<>();
    backTracking(s, 0, "", 0);
    return addresses;
  }

  private void backTracking(String ip, int index, String restored, int depth) {
    if (index == ip.length() && depth == 4) {
      addresses.add(restored);
    } else if (depth < 4) {
      for (int i = 1; i < 4; i++) {
        if (index + i > ip.length()) {
          break;
        }
        String partial = ip.substring(index, index + i);
        if ((!partial.startsWith("0") && Integer.parseInt(partial) <= 255)
            || (partial.startsWith("0") && partial.length() == 1)) {
          if (depth == 0) {
            backTracking(ip, index + i, partial, depth + 1);
          } else {
            backTracking(ip, index + i, restored + "." + partial, depth + 1);
          }
        }
      }
    }
  }
}
