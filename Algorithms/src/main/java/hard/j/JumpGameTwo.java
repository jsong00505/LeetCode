package hard.j;

/**
 * Created by jsong on 2019-04-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Jump Game II (https://leetcode.com/problems/jump-game-ii/)
 */
public class JumpGameTwo {

  // this solution is so beautiful and clean.
  public int jump(int[] nums) {
    int jumps = 0, currentEnd = 0, currentFarthest = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      currentFarthest = Math.max(currentFarthest, i + nums[i]);
      if (i == currentEnd) {
        jumps++;
        currentEnd = currentFarthest;
      }
    }
    return jumps;
  }

  public int myOwnSolution(int[] nums) {
    int minimum = 0;
    int i = 0;
    while (i < nums.length) {
      if (i + 1 >= nums.length) {
        break;
      } else if (i + nums[i] + 1 >= nums.length) {
        minimum++;
        break;
      }
      int step = nums[i];
      int biggest = nums[i];
      int biggestIndex = i;
      for (int j = 1; j <= step; j++) {
        if (biggest <= nums[j + i] + j) {
          biggest = nums[j + i] + j;
          biggestIndex = i + j;
        }
      }
      i = biggestIndex;
      minimum++;
    }
    return minimum;
  }
}
