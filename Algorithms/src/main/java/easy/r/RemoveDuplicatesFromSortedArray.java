package easy.r;

/**
 * Created by jsong on 2019-03-29.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Remove Duplicates from Sorted Array
 *     https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int length = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[length]) {
        nums[++length] = nums[j];
      }
    }
    return length + 1;
  }
}
