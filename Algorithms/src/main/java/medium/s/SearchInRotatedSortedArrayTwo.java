package medium.s;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Search in Rotated Sorted Array II
 * (https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 */
public class SearchInRotatedSortedArrayTwo {
  public boolean search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while(left <= right) {
      int middle = (left + right) / 2;
      if(nums[middle] == target) {
        return true;
      } else if(nums[left] == nums[right]) {
        if(nums[middle] > target) {

        }
      } else if(nums[middle] > target) {
        if(nums[left] <= target) {
          right = middle - 1;
        } else {
          left = middle + 1;
        }
      } else {
        if (nums[right] >= target) {
          left = middle + 1;
        } else {
          right = middle - 1;
        }
      }
    }
    return false;
  }
}
