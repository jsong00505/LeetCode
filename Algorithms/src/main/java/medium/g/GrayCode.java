package medium.g;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-04-16.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Gray Code (https://leetcode.com/problems/gray-code/)
 */
public class GrayCode {
  public List<Integer> grayCode(int n) {
    List<Integer> codes = new ArrayList<>();
    for (int i = 0; i < (1 << n); i++) {
      codes.add(i ^ (i >> 1));
    }
    return codes;
  }
}
