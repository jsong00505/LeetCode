package easy.c;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Climbing Stairs (https://leetcode.com/problems/climbing-stairs/)
 */
public class ClimbingStairs {
  public int climbStairs(int n) {
    int prev = 1;
    int current = 1;
    int ways = 1;
    for (int i = 1; i < n; i++) {
      int temp = current;
      current = prev + current;
      prev = temp;
    }
    return current;
  }
}
