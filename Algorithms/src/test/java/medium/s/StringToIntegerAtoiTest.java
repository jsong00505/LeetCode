package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {

  private StringToIntegerAtoi stringToIntegerAtoi;

  @Before
  public void setUp() {
    stringToIntegerAtoi = new StringToIntegerAtoi();
  }

  @Test
  public void test1MyAtoi() {
    // test input
    String str = "    -41";

    // set expected value
    int expected = -41;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2MyAtoi() {
    // test input
    String str = "42";

    // set expected value
    int expected = 42;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3MyAtoi() {
    // test input
    String str = "4193 with words";

    // set expected value
    int expected = 4193;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4MyAtoi() {
    // test input
    String str = "words and 987";

    // set expected value
    int expected = 0;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5MyAtoi() {
    // test input
    String str = "";

    // set expected value
    int expected = 0;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6MyAtoi() {
    // test input
    String str = "-";

    // set expected value
    int expected = 0;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7MyAtoi() {
    // test input
    String str = "-91283472332";

    // set expected value
    int expected = -2147483648;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8MyAtoi() {
    // test input
    String str = "91283472332";

    // set expected value
    int expected = 2147483647;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9MyAtoi() {
    // test input
    String str = "+1";

    // set expected value
    int expected = 1;

    // perform test
    int actual = stringToIntegerAtoi.myAtoi(str);

    // assertion
    assertEquals(expected, actual);
  }
}
