package easy.r;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

  private ReverseInteger reverseInteger;

  @Before
  public void setUp() {
    reverseInteger = new ReverseInteger();
  }

  @Test
  public void test1Reverse() {
    // test input
    int x = 123;

    // set expected value
    int expected = 321;

    // perform test
    int actual = reverseInteger.reverse(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Reverse() {
    // test input
    int x = -123;

    // set expected value
    int expected = -321;

    // perform test
    int actual = reverseInteger.reverse(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Reverse() {
    // test input
    int x = 120;

    // set expected value
    int expected = 21;

    // perform test
    int actual = reverseInteger.reverse(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Reverse() {
    // test input
    int x = 1534236469;

    // set expected value
    int expected = 0;

    // perform test
    int actual = reverseInteger.reverse(x);

    // assertion
    assertEquals(expected, actual);
  }
}
