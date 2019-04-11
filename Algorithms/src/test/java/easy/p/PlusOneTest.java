package easy.p;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

  private PlusOne plusOne;

  @Before
  public void setUp() {
    plusOne = new PlusOne();
  }

  @Test
  public void plusOne() {
    // test input
    int[] digits = {9};

    // set expected value
    int[] expected = {1, 0};

    // perform test
    int[] actual = plusOne.plusOne(digits);

    // assertion
    assertArrayEquals(expected, actual);
  }
}
