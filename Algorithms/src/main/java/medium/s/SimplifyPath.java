package medium.s;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by jsong on 2019-04-11.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Simplify Path (https://leetcode.com/problems/simpify-path/)
 */
public class SimplifyPath {

  public String simplifyPat1h(String path) {
    if (path == null || "".equals(path)) {
      return "";
    }
    String[] folders = path.split("/");
    List<String> periods = Arrays.asList("", ".", "..");

    Stack<String> stack = new Stack<>();
    for (String folder : folders) {
      if (folder.equals("..") && !stack.isEmpty()) {
        stack.pop();
      } else if (!periods.contains(folder)) {
        stack.push(folder);
      }
    }

    StringBuilder canonicalPath = new StringBuilder();
    while (!stack.isEmpty()) {
      canonicalPath.insert(0, "/" + stack.pop());
    }
    return canonicalPath.toString().isEmpty() ? "/" : canonicalPath.toString();
  }

  private char SLASH = '/';
  private char PERIOD = '.';

  public String simplifyPath(String path) {
    if (path == null || "".equals(path)) {
      return "";
    }
    Stack<Character> stack = new Stack<>();
    for (char p : path.toCharArray()) {
      if (stack.isEmpty()) {
        stack.push(p);
      } else {
        if (p == SLASH) {
          if (stack.peek() == PERIOD) {
            int periodCount = 0;
            while (stack.peek() == PERIOD) {
              stack.pop();
              periodCount++;
            }

            if (periodCount == 2 && stack.peek() == SLASH) {
              if (stack.size() > 1) {
                stack.pop();
                while (stack.peek() != SLASH) {
                  stack.pop();
                }
              }
            } else if (stack.peek() != SLASH) {
              while (periodCount > 0) {
                stack.push(PERIOD);
                periodCount--;
              }
              stack.push(SLASH);
            }
          } else if (stack.peek() != SLASH) {
            stack.push(p);
          }
        } else {
          stack.push(p);
        }
      }
    }

    if (stack.isEmpty()) {
      return "";
    }
    if (stack.peek() == SLASH && stack.size() > 1) {
      stack.pop();
    } else if (stack.peek() == PERIOD) {
      int periodCount = 0;
      while (stack.peek() == PERIOD) {
        stack.pop();
        periodCount++;
      }
      if (periodCount == 1 && stack.peek() == SLASH) {
        if (stack.size() > 1) {
          stack.pop();
        }
      } else if (periodCount == 2 && stack.peek() == SLASH) {
        if (stack.size() > 1) {
          stack.pop();
          while (stack.peek() != SLASH) {
            stack.pop();
          }
          if (stack.size() > 1) {
            stack.pop();
          }
        }
      } else {
        while (periodCount > 0) {
          stack.push(PERIOD);
          periodCount--;
        }
      }
    }
    StringBuilder canonicalPath = new StringBuilder();
    while (!stack.isEmpty()) {
      canonicalPath.insert(0, stack.pop());
    }
    return canonicalPath.toString();
  }
}
