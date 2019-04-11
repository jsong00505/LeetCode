package easy.a;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Add Binary (https://leetcode.com/problems/add-binary/)
 */
public class AddBinary {
  private char ZERO = '0';

  public String addBinary(String a, String b) {
    StringBuilder binary = new StringBuilder();
    int aIndex = a.length() - 1;
    int bIndex = b.length() - 1;
    int carry = 0;
    while (aIndex >= 0 || bIndex >= 0) {
      int numbA = aIndex < 0 ? 0 : a.charAt(aIndex) - ZERO;
      int numbB = bIndex < 0 ? 0 : b.charAt(bIndex) - ZERO;
      int sum = numbA + numbB + carry;
      if (sum > 1) {
        carry = sum / 2;
      } else {
        carry = 0;
      }
      sum %= 2;

      binary.insert(0, sum);
      aIndex--;
      bIndex--;
    }

    if (carry == 1) {
      binary.insert(0, 1);
    }

    return binary.toString();
  }
}
