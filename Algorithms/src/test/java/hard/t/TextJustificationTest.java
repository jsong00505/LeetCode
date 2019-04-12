package hard.t;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TextJustificationTest {
  private TextJustification textJustification;

  @Before
  public void setUp() {
    textJustification = new TextJustification();
  }

  @Test
  public void test1FullJustify() {
    // test input
    String[] words = new String[] {"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth = 16;
    // set expected value
    List<String> expected =
        Arrays.asList("This    is    an", "example  of text", "justification.  ");
    // perform test
    List<String> actual = textJustification.fullJustify(words, maxWidth);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2FullJustify() {
    // test input
    String[] words = new String[] {"What", "must", "be", "acknowledgment", "shall", "be"};
    int maxWidth = 16;
    // set expected value
    List<String> expected =
        Arrays.asList("What   must   be", "acknowledgment  ", "shall be        ");
    // perform test
    List<String> actual = textJustification.fullJustify(words, maxWidth);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3FullJustify() {
    // test input
    String[] words =
        new String[] {
          "Science",
          "is",
          "what",
          "we",
          "understand",
          "well",
          "enough",
          "to",
          "explain",
          "to",
          "a",
          "computer.",
          "Art",
          "is",
          "everything",
          "else",
          "we",
          "do"
        };
    int maxWidth = 20;
    // set expected value
    List<String> expected =
        Arrays.asList(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  ");
    // perform test
    List<String> actual = textJustification.fullJustify(words, maxWidth);
    // assertion
    assertEquals(expected, actual);
  }
}
