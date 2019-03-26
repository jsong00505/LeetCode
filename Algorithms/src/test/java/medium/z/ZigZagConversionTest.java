package medium.z;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigZagConversionTest {

  private ZigZagConversion zigZagConversion;

  @Before
  public void setUp() {
    zigZagConversion = new ZigZagConversion();
  }

  @Test
  public void test1Convert() {
    // test inputs
    String s = "PAYPALISHIRING";
    int numRows = 3;

    // set expected value
    String expected = "PAHNAPLSIIGYIR";

    // perform test
    String actual = zigZagConversion.convert(s, numRows);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test2Convert() {
    // test inputs
    String s = "PAYPALISHIRING";
    int numRows = 4;

    // set expected value
    String expected = "PINALSIGYAHRPI";

    // perform test
    String actual = zigZagConversion.convert(s, numRows);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test3Convert() {
    // test inputs
    String s = "PAYPALISHIRING";
    int numRows = 5;

    // set expected value
    String expected = "PHASIYIRPLIGAN";

    // perform test
    String actual = zigZagConversion.convert(s, numRows);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test4Convert() {
    // test inputs
    String s = "";
    int numRows = 1;

    // set expected value
    String expected = "";

    // perform test
    String actual = zigZagConversion.convert(s, numRows);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test5Convert() {
    // test inputs
    String s = "A";
    int numRows = 2;

    // set expected value
    String expected = "A";

    // perform test
    String actual = zigZagConversion.convert(s, numRows);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test6Convert() {
    // test inputs
    String s = "AB";
    int numRows = 1;

    // set expected value
    String expected = "AB";

    // perform test
    String actual = zigZagConversion.convert(s, numRows);

    // assertions
    assertEquals(expected, actual);
  }
}
