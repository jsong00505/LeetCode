package easy.l;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

  private LongestCommonPrefix longestCommonPrefix;

  @Before
  public void setUp() {
    longestCommonPrefix = new LongestCommonPrefix();
  }

  @Test
  public void test1LongestCommonPrefix() {
    // test input
    String[] strs = {"flower", "flow", "flight"};

    // set expected value
    String expected = "fl";

    // perform test
    String actual = longestCommonPrefix.longestCommonPrefix(strs);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2LongestCommonPrefix() {
    // test input
    String[] strs = {"dog", "racecar", "car"};

    // set expected value
    String expected = "";

    // perform test
    String actual = longestCommonPrefix.longestCommonPrefix(strs);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3LongestCommonPrefix() {
    // test input
    String[] strs = {};

    // set expected value
    String expected = "";

    // perform test
    String actual = longestCommonPrefix.longestCommonPrefix(strs);

    // assertion
    assertEquals(expected, actual);
  }
}
