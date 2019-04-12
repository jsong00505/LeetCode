package easy.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtXTest {

  private SqrtX sqrtX;

  @Before
  public void setUp() {
    sqrtX = new SqrtX();
  }

  @Test
  public void test1MySqrt() {
    // test input
    int x = 0;

    // set expected value
    int expected = 0;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2MySqrt() {
    // test input
    int x = 1;

    // set expected value
    int expected = 1;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3MySqrt() {
    // test input
    int x = 2;

    // set expected value
    int expected = 1;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4MySqrt() {
    // test input
    int x = 3;

    // set expected value
    int expected = 1;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5MySqrt() {
    // test input
    int x = 4;

    // set expected value
    int expected = 2;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6MySqrt() {
    // test input
    int x = 2147395599;

    // set expected value
    int expected = 46339;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7MySqrt() {
    // test input
    int x = 2147395600;

    // set expected value
    int expected = 46340;

    // perform test
    int actual = sqrtX.mySqrt(x);

    // assertion
    assertEquals(expected, actual);
  }
}
