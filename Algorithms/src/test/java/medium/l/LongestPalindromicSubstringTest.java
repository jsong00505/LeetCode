package medium.l;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

  private LongestPalindromicSubstring longestPalindromicSubstring;

  @Before
  public void setUp() {
    longestPalindromicSubstring = new LongestPalindromicSubstring();
  }

  @Test
  public void test1LongestPalindrome() {
    // test input
    String s = "babad";

    // set expected value
    String expected = "bab";

    // perform test
    String actual = longestPalindromicSubstring.longestPalindrome(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test2LongestPalindrome() {
    // test input
    String s = "cbbd";

    // set expected value
    String expected = "bb";

    // perform test
    String actual = longestPalindromicSubstring.longestPalindrome(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test3LongestPalindrome() {
    // test input
    String s = "babaddtattarrattatddetartrateedredividerb";

    // set expected value
    String expected = "ddtattarrattatdd";

    // perform test
    String actual = longestPalindromicSubstring.longestPalindrome(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test4LongestPalindrome() {
    // test input
    String s = "";

    // set expected value
    String expected = "";

    // perform test
    String actual = longestPalindromicSubstring.longestPalindrome(s);

    // assertions
    assertEquals(expected, actual);
  }
}
