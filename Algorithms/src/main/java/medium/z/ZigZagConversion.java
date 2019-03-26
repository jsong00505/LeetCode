package medium.z;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - ZigZag Conversion (https://leetcode.com/problems/zigzag-conversion/)
 */
public class ZigZagConversion {
  public String convert(String s, int numRows) {

    if (s.isEmpty()) {
      return s;
    }

    Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
    int row = 1;
    boolean reverse = false;
    for (char c : s.toCharArray()) {

      if (map.containsKey(row)) {
        map.get(row).append(c);
      } else {
        StringBuilder builder = new StringBuilder();
        map.put(row, builder.append(c));
      }

      if (numRows != 1) {
        if (row == numRows) {
          row--;
          reverse = true;
        } else if (row == 1) {
          row++;
          reverse = false;
        } else if (reverse) {
          row--;
        } else {
          row++;
        }
      }
    }

    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= numRows; i++) {
      if (map.containsKey(i)) {
        result.append(map.get(i));
      }
    }
    return result.toString();
  }
}
