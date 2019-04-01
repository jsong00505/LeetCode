package hard.s;

import java.util.*;

/**
 * Created by jsong on 2019-03-31.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Substring with Concatenation of All Words
 *     (https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
 */
public class SubstringWithConcatenationOfAllWords {
  public List<Integer> findSubstring(String s, String[] words) {

    if (words.length == 0) {
      return Collections.emptyList();
    }

    int num = words.length;
    int len = words[0].length();
    Map<String, Integer> counts = new HashMap<>();
    for (String word : words) {
      counts.put(word, counts.getOrDefault(word, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < s.length() - num * len + 1; i++) {
      Map<String, Integer> seen = new HashMap<>();
      int j = 0;
      while (j < num) {
        int begin = i + j * len;
        int end = begin + len;
        String word = s.substring(begin, end);

        if (counts.containsKey(word)) {
          seen.put(word, seen.getOrDefault(word, 0) + 1);
        } else {
          break;
        }

        if (seen.get(word) > counts.get(word)) {
          break;
        }

        j++;
      }

      if (j == num) {
        result.add(i);
      }
    }

    return result;
  }
}
