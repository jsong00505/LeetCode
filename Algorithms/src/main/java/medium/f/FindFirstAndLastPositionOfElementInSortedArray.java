package medium.f;

/**
 * Created by jsong on 2019-04-01.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Find First and Last Position of Element in Sorted Array
 *     (https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
  public int[] searchRange(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int begin = -1;
    int end = -1;
    int mid;

    // find first
    while (left <= right) {
      mid = (left + right) / 2;
      if (nums[mid] == target) {
        begin = mid;
        end = mid;
        right = mid - 1;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    // find last
    left = begin;
    right = nums.length - 1;
    while (left <= right && begin != -1) {
      mid = (left + right) / 2;
      if (nums[mid] == target) {
        end = mid;
        left = mid + 1;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return new int[] {begin, end};
  }
}
