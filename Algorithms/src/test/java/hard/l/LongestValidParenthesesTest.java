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
  public void test1LongestValidParentheses() {
    // test input
    String s = "(()";

    // set expected value
    int expected = 2;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2LongestValidParentheses() {
    // test input
    String s = ")()())";

    // set expected value
    int expected = 4;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3LongestValidParentheses() {
    // test input
    String s = "";

    // set expected value
    int expected = 0;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4LongestValidParentheses() {
    // test input
    String s = "(()()))(())()())()((()))))";

    // set expected value
    int expected = 8;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5LongestValidParentheses() {
    // test input
    String s = ")))))))(";

    // set expected value
    int expected = 0;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6LongestValidParentheses() {
    // test input
    String s = ")";

    // set expected value
    int expected = 0;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7LongestValidParentheses() {
    // test input
    String s = "(";

    // set expected value
    int expected = 0;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8LongestValidParentheses() {
    // test input
    String s = "()(()";

    // set expected value
    int expected = 2;

    // perform test
    int actual = longestValidParentheses.longestValidParentheses(s);

    // assertion
    assertEquals(expected, actual);
  }
}
