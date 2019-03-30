package easy.i;

/**
 * Created by jsong on 2019-03-30.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Implement strStr() (https://leetcode.com/problems/implement-strstr/)
 */
public class ImplementStrStr {
  public int strStr(String haystack, String needle) {

    if (needle.length() == 0) {
      return 0;
    }

    int needleLength = needle.length();
    char firstChar = needle.charAt(0);

    for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
      char c = haystack.charAt(i);
      if (c == firstChar) {
        int length;
        for (length = 1; length < needleLength; length++) {
          if (haystack.charAt(i + length) != needle.charAt(length)) {
            break;
          }
        }
        if (length == needleLength) {
          return i;
        }
      }
    }
    return -1;
  }
}
