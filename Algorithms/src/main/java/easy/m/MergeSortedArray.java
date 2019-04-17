package easy.m;

/**
 * Created by jsong on 2019-04-16.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Merge Sorted Array (https://leetcode.com/problems/merge-sorted-array/)
 */
public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int length = nums1.length;
    if (m + n != length) {
      return;
    }
    int i = 0;
    int j = 0;
    while (i + j < length && j < n) {
      if (i >= m) {
        nums1[i + j] = nums2[j++];
      } else if (nums1[i + j] > nums2[j]) {
        shift(nums1, i + j);
        nums1[i + j] = nums2[j++];
      } else {
        i++;
      }
    }
  }

  public void shift(int[] nums, int index) {
    for (int i = nums.length - 2; i >= index; i--) {
      nums[i + 1] = nums[i];
    }
  }
}
