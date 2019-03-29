package easy.v;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

  private ValidParentheses validParentheses;

  @Before
  public void setUp() {
    validParentheses = new ValidParentheses();
  }

  @Test
  public void test1IsValid() {
    // test input
    String s = "()";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2IsValid() {
    // test input
    String s = "()[]{}";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3IsValid() {
    // test input
    String s = "(]";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4IsValid() {
    // test input
    String s = "([)]";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5IsValid() {
    // test input
    String s = "{[]}";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6IsValid() {
    // test input
    String s = "{[]}}";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7IsValid() {
    // test input
    String s = "{[]{}}";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8IsValid() {
    // test input
    String s = "{[{]}}";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9IsValid() {
    // test input
    String s = "{[{]{}[](})}";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = validParentheses.isValid(s);

    // assertion
    assertEquals(expected, actual);
  }
}
