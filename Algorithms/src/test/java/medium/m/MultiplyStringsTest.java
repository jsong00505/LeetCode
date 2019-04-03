package medium.m;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringsTest {

  private MultiplyStrings multiplyStrings;

  @Before
  public void setUp() {
    multiplyStrings = new MultiplyStrings();
  }

  @Test
  public void test1Multiply() {
    // test input
    String num1 = "2";
    String num2 = "6";

    // set expected value
    String expected = "12";

    // perform test
    String actual = multiplyStrings.multiply(num1, num2);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Multiply() {
    // test input
    String num1 = "0";
    String num2 = "123123";

    // set expected value
    String expected = "0";

    // perform test
    String actual = multiplyStrings.multiply(num1, num2);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Multiply() {
    // test input
    String num1 = "10";
    String num2 = "123";

    // set expected value
    String expected = "1230";

    // perform test
    String actual = multiplyStrings.multiply(num1, num2);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Multiply() {
    // test input
    String num1 = "123";
    String num2 = "456";

    // set expected value
    String expected = "56088";

    // perform test
    String actual = multiplyStrings.multiply(num1, num2);

    // assertion
    assertEquals(expected, actual);
  }
}
