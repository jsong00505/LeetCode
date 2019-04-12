package hard.t;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jsong on 2019-04-11.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Text Justification (https://leetcode.com/problems/text-justification/)
 */
public class TextJustification {

  public List<String> fullJustify(String[] words, int maxWidth) {
    Queue<String> queue = new LinkedList<>();
    int currentLength = 0;
    List<String> justification = new ArrayList<>();

    for (String word : words) {
      if (currentLength + queue.size() + word.length() <= maxWidth) {
        queue.add(word);
        currentLength += word.length();
      } else {
        generateJustification(justification, queue, maxWidth, currentLength, false);
        currentLength = word.length();
        queue.add(word);
      }
    }

    generateJustification(justification, queue, maxWidth, currentLength, true);

    return justification;
  }

  private void generateJustification(
      List<String> justification,
      Queue<String> queue,
      int maxWidth,
      int currentLength,
      boolean last) {
    StringBuilder line = new StringBuilder();
    int gap = 1;
    int additional = 0;
    if (!last && queue.size() > 1) {
      gap = (maxWidth - currentLength) / (queue.size() - 1);
      additional = last ? 0 : (maxWidth - currentLength) % (queue.size() - 1);
    }

    while (!queue.isEmpty()) {
      line.append(queue.poll());
      if (!queue.isEmpty()) {
        for (int i = 0; i < gap; i++) {
          line.append(" ");
        }
        if (additional > 0) {
          line.append(" ");
          additional--;
        }
      }
    }
    while (line.length() < maxWidth) {
      line.append(" ");
    }
    justification.add(line.toString());
  }
}
