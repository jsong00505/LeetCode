package easy.r;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

  private RomanToInteger romanToInteger;

  @Before
  public void setUp() {
    romanToInteger = new RomanToInteger();
  }

  @Test
  public void test1RomanToInt() {
    // test input
    String s = "III";

    // set expected value
    int expected = 3;

    // perform test
    int actual = romanToInteger.romanToInt(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2RomanToInt() {
    // test input
    String s = "IV";

    // set expected value
    int expected = 4;

    // perform test
    int actual = romanToInteger.romanToInt(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3RomanToInt() {
    // test input
    String s = "IX";

    // set expected value
    int expected = 9;

    // perform test
    int actual = romanToInteger.romanToInt(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4RomanToInt() {
    // test input
    String s = "LVIII";

    // set expected value
    int expected = 58;

    // perform test
    int actual = romanToInteger.romanToInt(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5RomanToInt() {
    // test input
    String s = "MCMXCIV";

    // set expected value
    int expected = 1994;

    // perform test
    int actual = romanToInteger.romanToInt(s);

    // assertion
    assertEquals(expected, actual);
  }
}
