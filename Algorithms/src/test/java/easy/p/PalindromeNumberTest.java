package easy.p;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

  private PalindromeNumber palindromeNumber;

  @Before
  public void setUp() {
    palindromeNumber = new PalindromeNumber();
  }

  @Test
  public void test1IsPalindrome() {
    // test input
    int x = 121;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = palindromeNumber.isPalindrome(x);

    assertEquals(expected, actual);
  }

  @Test
  public void test2IsPalindrome() {
    // test input
    int x = -121;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = palindromeNumber.isPalindrome(x);

    assertEquals(expected, actual);
  }

  @Test
  public void test3IsPalindrome() {
    // test input
    int x = 10;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = palindromeNumber.isPalindrome(x);

    assertEquals(expected, actual);
  }

  @Test
  public void test4IsPalindrome() {
    // test input
    int x = 0;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = palindromeNumber.isPalindrome(x);

    assertEquals(expected, actual);
  }
}
