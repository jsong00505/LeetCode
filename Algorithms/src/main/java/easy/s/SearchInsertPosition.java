package easy.s;

/**
 * Created by jsong on 2019-04-01.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Search Insert Position (https://leetcode.com/problems/search-insert-position/)
 */
public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target || nums[i] > target) {
        return i;
      }
    }
    return nums.length;
  }
}
