package easy.p;

import java.util.LinkedList;

/**
 * Created by jsong on 2019-03-25.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Palindrome Number (https://leetcode.com/problems/palindrome-number/)
 */
public class PalindromeNumber {
  public boolean isPalindrome(int x) {

    if (x < 0) {
      return false;
    }

    LinkedList<Integer> addFromFirst = new LinkedList<>();
    LinkedList<Integer> addFromLast = new LinkedList<>();
    while (x > 0) {
      int temp = x % 10;
      addFromFirst.addFirst(temp);
      addFromLast.addLast(temp);
      x /= 10;
    }

    return addFromFirst.equals(addFromLast);
  }
}
