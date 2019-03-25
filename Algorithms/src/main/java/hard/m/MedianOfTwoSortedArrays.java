package hard.m;

/**
 * Created by jsong on 25/03/2019.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Median Of Two Sorted Arrays(https://leetcode.com/problems/median-of-two-sorted-arrays/)
 */
public class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int i = 0;
    int j = 0;
    int length = nums1.length + nums2.length;
    int halfLength = length / 2;
    boolean even = length % 2 == 0;
    if (even) {
      halfLength--;
    }

    for (int k = 0; k < halfLength; k++) {
      if (i == nums1.length) {
        j++;
      } else if (j == nums2.length) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else if (nums1[i] <= nums2[j]) {
        i++;
      }
    }

    double median = 0;
    if (i == nums1.length) {
      median = nums2[j];
      j++;
    } else if (j == nums2.length) {
      median = nums1[i];
      i++;
    } else if (nums1[i] > nums2[j]) {
      median = nums2[j];
      j++;
    } else if (nums1[i] <= nums2[j]) {
      median = nums1[i];
      i++;
    }

    if (even) {
      if (i == nums1.length) {
        median = (median + nums2[j]) / 2;
      } else if (j == nums2.length) {
        median = (median + nums1[i]) / 2;
      } else if (nums1[i] > nums2[j]) {
        median = (median + nums2[j]) / 2;
      } else if (nums1[i] <= nums2[j]) {
        median = (median + nums1[i]) / 2;
      }
    }

    return median;
  }
}
