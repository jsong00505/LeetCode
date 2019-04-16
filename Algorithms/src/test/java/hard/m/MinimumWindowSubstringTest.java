package hard.m;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumWindowSubstringTest {

  private MinimumWindowSubstring minimumWindowSubstring;

  @Before
  public void setUp() {
    minimumWindowSubstring = new MinimumWindowSubstring();
  }

  @Test
  public void test1MinWindow() {
    // test input
    String s = "ADOBECODEBANC";
    String t = "ABC";

    // set expected value
    String expected = "BANC";

    // perform test
    String actual = minimumWindowSubstring.minWindow(s, t);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2MinWindow() {
    // test input
    String s = "";
    String t = "ABC";

    // set expected value
    String expected = "";

    // perform test
    String actual = minimumWindowSubstring.minWindow(s, t);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3MinWindow() {
    // test input
    String s = "";
    String t = "";

    // set expected value
    String expected = "";

    // perform test
    String actual = minimumWindowSubstring.minWindow(s, t);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4MinWindow() {
    // test input
    String s = "BC";
    String t = "ABC";

    // set expected value
    String expected = "";

    // perform test
    String actual = minimumWindowSubstring.minWindow(s, t);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5MinWindow() {
    // test input
    String s = "AAAT";
    String t = "AT";

    // set expected value
    String expected = "AT";

    // perform test
    String actual = minimumWindowSubstring.minWindow(s, t);

    // assertion
    assertEquals(expected, actual);
  }
}
