package hard.f;

/**
 * Created by jsong on 2019-04-02.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - First Missing Positive (https://leetcode.com/problems/first-missing-positive/)
 */
public class FirstMissingPositive {
  public int firstMissingPositive(int[] nums) {

    int start = 0;
    int end = nums.length - 1;
    int length = nums.length;
    while (start <= end) {
      // if the number is bigger than length or less than and equals to zero,
      // it moves to the end and the pointer one less from end
      if (nums[start] > length || nums[start] <= 0) {
        nums[start] = nums[end--];
      } else if (nums[start] == start + 1) {
        // if the number matches with the current position moves the pointer to the next
        start++;
      } else if (nums[start] == nums[nums[start] - 1]) {
        // if the index has the right value moves the pointer to the next
        start++;
      } else {
        // if the number is the right number moves it to the right position
        int temp = nums[start];
        nums[start] = nums[nums[start] - 1];
        nums[temp - 1] = temp;
      }
    }

    // validation
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }

    // if all numbers are valid numbers just return the possible biggest number
    return nums.length + 1;
  }
}
