package easy.c;

/**
 * Created by jsong on 2019-04-01.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Count and Say (https://leetcode.com/problems/count-and-say/)
 */
public class CountAndSay {
  public String countAndSay(int n) {
    StringBuilder say = new StringBuilder("1");
    for (int i = 1; i < n; i++) {
      String temp = say.toString();
      say = new StringBuilder();
      char digit = temp.charAt(0);
      int count = 1;
      for (int j = 1; j < temp.length(); j++) {
        if (digit != temp.charAt(j)) {
          say.append(count).append(digit);
          digit = temp.charAt(j);
          count = 1;
        } else {
          count++;
        }
      }
      say.append(count).append(digit);
    }
    return say.toString();
  }
}
