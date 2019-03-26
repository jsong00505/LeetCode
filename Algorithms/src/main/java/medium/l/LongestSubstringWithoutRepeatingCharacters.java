package medium.l;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by jsong on 24/03/2019.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Longest Substring Without Repeating Characters
 *     (https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {

    // return string's length if the length is equal or less than 1
    if (s.length() <= 1) {
      return s.length();
    }

    int longest = 0;
    LinkedList<Character> queue = new LinkedList<>();
    for (char c : s.toCharArray()) {
      if (queue.contains(c)) {
        longest = longest < queue.size() ? queue.size() : longest;

        // remove till removing the current character
        while (queue.contains(c)) {
          queue.removeFirst();
        }

        queue.addLast(c);
      } else {
        queue.addLast(c);
      }
    }

    longest = longest < queue.size() ? queue.size() : longest;
    return longest;
  }

  // brute force algorithm(passed but poor performance)
  public int bruteForce(String s) {

    // return string's length if the length is equal or less than 1
    if (s.length() <= 1) {
      return s.length();
    }

    int longest = 0;
    Set<Character> chars;
    // O(n^2)
    for (int i = 0; i < s.length() - 1; i++) {
      chars = new HashSet<>();
      chars.add(s.charAt(i));
      int length = 1;
      for (int j = i + 1; j < s.length(); j++) {
        if (chars.contains(s.charAt(j))) {
          longest = longest < length ? length : longest;
          break;
        } else {
          chars.add(s.charAt(j));
          length++;
          longest = longest < length ? length : longest;
        }
      }
    }
    return longest;
  }
}
