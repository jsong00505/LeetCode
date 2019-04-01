package medium.n;

/**
 * Created by jsong on 2019-03-31.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Next Permutation (https://leetcode.com/problems/next-permutation/)
 */
public class NextPermutation {
  public void nextPermutation(int[] nums) {
    int begin = nums.length - 2;
    int end = nums.length - 1;

    boolean find = false;
    while (begin >= 0 && !find) {
      if (nums[begin] < nums[begin + 1]) {
        find = true;
      } else {
        begin--;
      }
    }

    // reverse
    if (!find) {
      reverse(nums, 0, end);
    } else if (end - begin == 1) {
      swap(nums, begin, end);
    } else {
      int index = begin + 1;
      reverse(nums, index, end);
      while (index <= end && nums[begin] >= nums[index]) {
        index++;
      }
      swap(nums, begin, index);
    }
  }

  private void reverse(int[] nums, int begin, int end) {
    while (begin < end) {
      swap(nums, begin, end);
      begin++;
      end--;
    }
  }

  private void swap(int[] nums, int begin, int end) {
    int temp = nums[begin];
    nums[begin] = nums[end];
    nums[end] = temp;
  }
}
