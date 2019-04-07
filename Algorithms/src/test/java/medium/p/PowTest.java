package medium.p;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowTest {

  private Pow pow;

  @Before
  public void setUp() {
    pow = new Pow();
  }

  @Test
  public void test1MyPow() {
    // test input
    double x = 2.0;
    int n = 10;

    // set expected value
    double expected = 1024.0;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0);
  }

  @Test
  public void test2MyPow() {
    // test input
    double x = 2.0;
    int n = 0;

    // set expected value
    double expected = 1.0;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test3MyPow() {
    // test input
    double x = 2.10000;
    int n = 3;

    // set expected value
    double expected = 9.26100;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test4MyPow() {
    // test input
    double x = 2.0000;
    int n = -2;

    // set expected value
    double expected = 0.25000;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test5MyPow() {
    // test input
    double x = 2.0000;
    int n = -4;

    // set expected value
    double expected = 0.0625;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test6MyPow() {
    // test input
    double x = 3.0000;
    int n = -4;

    // set expected value
    double expected = 0.01235;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test7MyPow() {
    // test input
    double x = 0.00001;
    int n = 2147483647;

    // set expected value
    double expected = 0.0;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test8MyPow() {
    // test input
    double x = 2.00000;
    int n = -2147483648;

    // set expected value
    double expected = 0.0;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }

  @Test
  public void test9MyPow() {
    // test input
    double x = -1.00000;
    int n = -2147483648;

    // set expected value
    double expected = 1.0;

    // perform test
    double actual = pow.myPow(x, n);

    // assertion
    assertEquals(expected, actual, 0.0001);
  }
}
