package medium.s;

/**
 * Created by jsong on 2019-04-12.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Sort Colors (https://leetcode.com/problems/sort-colors/)
 */
public class SortColors {
  public void sortColors(int[] nums) {
    int index = 0;
    int left = 0;
    int right = nums.length - 1;

    while (index <= right) {
      if (nums[index] == 0) {
        nums[index] = nums[left];
        nums[left++] = 0;
      } else if (nums[index] == 2) {
        nums[index] = nums[right];
        nums[right--] = 2;
      } else {
        index++;
      }
      index = index < left ? left : index;
    }
  }
}
