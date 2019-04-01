package hard.l;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestValidParenthesesTest {

  private LongestValidParentheses longestValidParentheses;

  @Before
  public void setUp() {
    longestValidParentheses = new LongestValidParentheses();
  }

  @Test
  public void longestValidParentheses() {
    // test input
    String s = "(()";

    // set expected value
    int expected = 2;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }
}
