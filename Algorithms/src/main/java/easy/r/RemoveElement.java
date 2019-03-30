package easy.r;

/**
 * Created by jsong on 2019-03-30.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Remove Element (https://leetcode.com/problems/remove-element/)
 */
public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int length = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[length] = nums[i];
        length++;
      }
    }
    return length;
  }
}
