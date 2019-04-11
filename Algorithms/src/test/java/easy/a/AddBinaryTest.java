package easy.a;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

  private AddBinary addBinary;

  @Before
  public void setUp() {
    addBinary = new AddBinary();
  }

  @Test
  public void test1AddBinary() {
    // test input
    String a = "11";
    String b = "1";

    // set expected value
    String expected = "100";

    // perform test
    String actual = addBinary.addBinary(a, b);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2AddBinary() {
    // test input
    String a = "1010";
    String b = "1011";

    // set expected value
    String expected = "10101";

    // perform test
    String actual = addBinary.addBinary(a, b);

    // assertion
    assertEquals(expected, actual);
  }
}
