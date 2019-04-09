package medium.j;

/**
 * Created by jsong on 2019-04-08.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Jump Game (https://leetcode.com/problems/jump-game/)
 */
public class JumpGame {
  public boolean canJump(int[] nums) {
    int farthest = 0;
    for (int i = 0; i < nums.length; i++) {
      farthest = Math.max(farthest, i + nums[i]);

      // if there is no way to go further stop the loop
      if (farthest == i && nums[i] == 0) {
        break;
      } else if (farthest >= nums.length - 1) {
        return true;
      }
    }

    return farthest >= nums.length - 1;
  }
}
