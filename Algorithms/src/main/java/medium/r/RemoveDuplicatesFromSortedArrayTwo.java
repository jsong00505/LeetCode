package medium.r;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Remove Duplicates from Sorted Array II
 * (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
 */
public class RemoveDuplicatesFromSortedArrayTwo {
  public int removeDuplicates(int[] nums) {
    if(nums == null || nums.length == 0) {
      return 0;
    }
    int count = 1;
    int index = 1;
    int prev = nums[0];
    for(int i = 1; i < nums.length; i++) {
      int cur = nums[i];
      if(prev != cur) {
        nums[index++] = cur;
        count = 1;
      } else {
        if(count < 2) {
          nums[index++] = cur;
          count++;
        }
      }
      prev = cur;
    }
    return index;
  }
}
