package hard.w;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WildcardMatchingTest {

  private WildcardMatching wildcardMatching;

  @Before
  public void setUp() {
    wildcardMatching = new WildcardMatching();
  }

  @Test
  public void test1IsMatch() {
    // test input
    String s = "aa";
    String p = "a";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2IsMatch() {
    // test input
    String s = "aa";
    String p = "*";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3IsMatch() {
    // test input
    String s = "cb";
    String p = "?a";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4IsMatch() {
    // test input
    String s = "adceb";
    String p = "*a*b";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5IsMatch() {
    // test input
    String s = "acdcb";
    String p = "a*c?b";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6IsMatch() {
    // test input
    String s = "";
    String p = "a";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7IsMatch() {
    // test input
    String s = "aa";
    String p = "";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8IsMatch() {
    // test input
    String s = "";
    String p = "*";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9IsMatch() {
    // test input
    String s = "";
    String p = "";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10IsMatch() {
    // test input
    String s = "aab";
    String p = "c*a*b";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wildcardMatching.isMatch(s, p);

    // assertion
    assertEquals(expected, actual);
  }
}
