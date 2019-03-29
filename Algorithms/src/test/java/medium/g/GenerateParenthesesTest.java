package medium.g;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GenerateParenthesesTest {

  private GenerateParentheses generateParentheses;

  @Before
  public void setUp() throws Exception {
    generateParentheses = new GenerateParentheses();
  }

  @Test
  public void test1GenerateParenthesis() {
    // test input
    int n = 3;

    // set expected value
    List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");

    // perform test
    List<String> actual = generateParentheses.generateParenthesis(n);

    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test2GenerateParenthesis() {
    // test input
    int n = 0;

    // set expected value
    List<String> expected = Arrays.asList("");

    // perform test
    List<String> actual = generateParentheses.generateParenthesis(n);

    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test3GenerateParenthesis() {
    // test input
    int n = 4;

    // set expected value
    List<String> expected =
        Arrays.asList(
            "(((())))",
            "((()()))",
            "((())())",
            "((()))()",
            "(()(()))",
            "(()()())",
            "(()())()",
            "(())(())",
            "(())()()",
            "()((()))",
            "()(()())",
            "()(())()",
            "()()(())",
            "()()()()");

    // perform test
    List<String> actual = generateParentheses.generateParenthesis(n);

    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }
}
