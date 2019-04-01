package medium.d;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideTwoIntegersTest {

  private DivideTwoIntegers divideTwoIntegers;

  @Before
  public void setUp() {
    divideTwoIntegers = new DivideTwoIntegers();
  }

  @Test
  public void test1Divide() {
    // test input
    int dividend = 10;
    int divisor = 3;

    // set expected value
    int expected = 3;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Divide() {
    // test input
    int dividend = 7;
    int divisor = -3;

    // set expected value
    int expected = -2;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Divide() {
    // test input
    int dividend = 1;
    int divisor = -1;

    // set expected value
    int expected = -1;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Divide() {
    // test input
    int dividend = 1;
    int divisor = 1;

    // set expected value
    int expected = 1;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5Divide() {
    // test input
    int dividend = -1;
    int divisor = 1;

    // set expected value
    int expected = -1;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6Divide() {
    // test input
    int dividend = -1;
    int divisor = -1;

    // set expected value
    int expected = 1;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7Divide() {
    // test input
    int dividend = -2147483648;
    int divisor = -1;

    // set expected value
    int expected = 2147483647;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8Divide() {
    // test input
    int dividend = -2147483648;
    int divisor = 1;

    // set expected value
    int expected = -2147483648;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9Divide() {
    // test input
    int dividend = 2147483647;
    int divisor = 2;

    // set expected value
    int expected = 1073741823;

    // perform test
    int actual = divideTwoIntegers.divide(dividend, divisor);

    // assertion
    assertEquals(expected, actual);
  }
}
