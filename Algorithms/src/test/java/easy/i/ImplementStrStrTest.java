package easy.i;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementStrStrTest {

  private ImplementStrStr implementStrStr;

  @Before
  public void setUp() {
    implementStrStr = new ImplementStrStr();
  }

  @Test
  public void test1StrStr() {
    // test input
    String haystack = "hello";
    String needle = "ll";

    // set expected value
    int expected = 2;

    // perform test
    int actual = implementStrStr.strStr(haystack, needle);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2StrStr() {
    // test input
    String haystack = "aaaaa";
    String needle = "bba";

    // set expected value
    int expected = -1;

    // perform test
    int actual = implementStrStr.strStr(haystack, needle);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3StrStr() {
    // test input
    String haystack = "";
    String needle = "";

    // set expected value
    int expected = 0;

    // perform test
    int actual = implementStrStr.strStr(haystack, needle);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4StrStr() {
    // test input
    String haystack = "a";
    String needle = "aab";

    // set expected value
    int expected = -1;

    // perform test
    int actual = implementStrStr.strStr(haystack, needle);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5StrStr() {
    // test input
    String haystack = "a";
    String needle = "a";

    // set expected value
    int expected = 0;

    // perform test
    int actual = implementStrStr.strStr(haystack, needle);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6StrStr() {
    // test input
    String haystack = "mississippi";
    String needle = "issip";

    // set expected value
    int expected = 4;

    // perform test
    int actual = implementStrStr.strStr(haystack, needle);

    // assertion
    assertEquals(expected, actual);
  }
}
