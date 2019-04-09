package easy.l;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

  private LengthOfLastWord lengthOfLastWord;

  @Before
  public void setUp() {
    lengthOfLastWord = new LengthOfLastWord();
  }

  @Test
  public void test1LengthOfLastWord() {
    // test input
    String s = "Hello World";

    // set expected value
    int expected = 5;

    // perform test
    int actual = lengthOfLastWord.lengthOfLastWord(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2LengthOfLastWord() {
    // test input
    String s = "Hello ";

    // set expected value
    int expected = 5;

    // perform test
    int actual = lengthOfLastWord.lengthOfLastWord(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3LengthOfLastWord() {
    // test input
    String s = " ";

    // set expected value
    int expected = 0;

    // perform test
    int actual = lengthOfLastWord.lengthOfLastWord(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4LengthOfLastWord() {
    // test input
    String s = "";

    // set expected value
    int expected = 0;

    // perform test
    int actual = lengthOfLastWord.lengthOfLastWord(s);

    // assertion
    assertEquals(expected, actual);
  }
}
