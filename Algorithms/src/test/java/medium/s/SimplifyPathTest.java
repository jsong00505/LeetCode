package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathTest {

  private SimplifyPath simplifyPath;

  @Before
  public void setUp() {
    simplifyPath = new SimplifyPath();
  }

  @Test
  public void test1SimplifyPath() {
    // test input
    String path = "/home/";

    // set expected value
    String expected = "/home";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2SimplifyPath() {
    // test input
    String path = "/../";

    // set expected value
    String expected = "/";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3SimplifyPath() {
    // test input
    String path = "/home//foo/";

    // set expected value
    String expected = "/home/foo";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4SimplifyPath() {
    // test input
    String path = "/a/./b/../../c/";

    // set expected value
    String expected = "/c";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5SimplifyPath() {
    // test input
    String path = "/a/../../b/../c//.//";

    // set expected value
    String expected = "/c";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6SimplifyPath() {
    // test input
    String path = "/a//b////c/d//././/..";

    // set expected value
    String expected = "/a/b/c";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7SimplifyPath() {
    // test input
    String path = "/.";

    // set expected value
    String expected = "/";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8SimplifyPath() {
    // test input
    String path = "/...";

    // set expected value
    String expected = "/...";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9SimplifyPath() {
    // test input
    String path = "";

    // set expected value
    String expected = "";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10SimplifyPath() {
    // test input
    String path = null;

    // set expected value
    String expected = "";

    // perform test
    String actual = simplifyPath.simplifyPath(path);

    // assertion
    assertEquals(expected, actual);
  }
}
