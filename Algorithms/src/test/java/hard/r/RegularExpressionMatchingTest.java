package hard.r;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularExpressionMatchingTest {

  private RegularExpressionMatching regularExpressionMatching;

  @Before
  public void setUp() {
    regularExpressionMatching = new RegularExpressionMatching();
  }

  @Test
  public void test1IsMatch() {
    // test input
    String s = "ss";
    String p = "s";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2IsMatch() {
    // test input
    String s = "ss";
    String p = "ss";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3IsMatch() {
    // test input
    String s = "ss";
    String p = "s*";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4IsMatch() {
    // test input
    String s = "a";
    String p = "s*a";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5IsMatch() {
    // test input
    String s = "ab";
    String p = ".*";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6IsMatch() {
    // test input
    String s = "mississippi";
    String p = "mis*is*p*.";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7IsMatch() {
    // test input
    String s = "aab";
    String p = "c*a*b";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8IsMatch() {
    // test input
    String s = "aaa";
    String p = "aaaa";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9IsMatch() {
    // test input
    String s = "aaa";
    String p = "ab*a*c*a";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10IsMatch() {
    // test input
    String s = "aaa";
    String p = "ab*.*b";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = regularExpressionMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }
}
