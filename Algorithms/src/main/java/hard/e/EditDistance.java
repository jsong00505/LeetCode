package hard.e;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Edit Distance (https://leetcode.com/problems/edit-distance/)
 */
public class EditDistance {
  public int minDistance(String word1, String word2) {
    int[][] distance = new int[word1.length() + 1][word2.length() + 1];
    // deletion
    for (int i = 0; i <= word1.length(); i++) {
      distance[i][0] = i;
    }
    // insertion
    for (int i = 0; i <= word2.length(); i++) {
      distance[0][i] = i;
    }
    for (int i = 1; i <= word1.length(); i++) {
      for (int j = 1; j <= word2.length(); j++) {
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
          distance[i][j] = distance[i - 1][j - 1];
        } else {
          int deletion = distance[i - 1][j] + 1;
          int insertion = distance[i][j - 1] + 1;
          int min = Math.min(deletion, insertion);
          int replacement = distance[i - 1][j - 1] + 1;
          min = Math.min(min, replacement);
          distance[i][j] = min;
        }
      }
    }
    return distance[word1.length()][word2.length()];
  }
}
