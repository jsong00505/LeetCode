package medium.i;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

  IntegerToRoman integerToRoman;

  @Before
  public void setUp() {
    integerToRoman = new IntegerToRoman();
  }

  @Test
  public void test1IntToRoman() {
    // test input
    int num = 3;

    // set expected value
    String expected = "III";

    // perform test
    String actual = integerToRoman.intToRoman(num);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2IntToRoman() {
    // test input
    int num = 4;

    // set expected value
    String expected = "IV";

    // perform test
    String actual = integerToRoman.intToRoman(num);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3IntToRoman() {
    // test input
    int num = 9;

    // set expected value
    String expected = "IX";

    // perform test
    String actual = integerToRoman.intToRoman(num);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4IntToRoman() {
    // test input
    int num = 58;

    // set expected value
    String expected = "LVIII";

    // perform test
    String actual = integerToRoman.intToRoman(num);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5IntToRoman() {
    // test input
    int num = 1994;

    // set expected value
    String expected = "MCMXCIV";

    // perform test
    String actual = integerToRoman.intToRoman(num);

    // assertion
    assertEquals(expected, actual);
  }
}
