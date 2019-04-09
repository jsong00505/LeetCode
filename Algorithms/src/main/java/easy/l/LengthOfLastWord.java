package easy.l;

/**
 * Created by jsong on 2019-04-08.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Length of Last Word (https://leetcode.com/problems/length-of-last-word/)
 */
public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    String[] words = s.split(" ");
    return words.length == 0 ? 0 : words[words.length - 1].length();
  }
}
