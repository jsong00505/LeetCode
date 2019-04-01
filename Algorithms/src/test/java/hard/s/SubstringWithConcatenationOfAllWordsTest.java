package hard.s;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubstringWithConcatenationOfAllWordsTest {

  private SubstringWithConcatenationOfAllWords substringWithConcatenationOfAllWords;

  @Before
  public void setUp() {
    substringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
  }

  @Test
  public void test1FindSubstring() {
    // test input
    String s = "barfoothefoobarman";
    String[] words = {"bar", "foo"};

    // set expected value
    List<Integer> expected = Arrays.asList(0, 9);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2FindSubstring() {
    // test input
    String s = "wordgoodgoodgoodbestword";
    String[] words = {"word", "good", "best", "word"};

    // set expected value
    List<Integer> expected = Collections.emptyList();

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3FindSubstring() {
    // test input
    String s = "barfoothwordgoodgoodgoodbestwordefoobarman";
    String[] words = {"word", "good"};

    // set expected value
    List<Integer> expected = Collections.singletonList(8);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4FindSubstring() {
    // test input
    String s = "barfoothwordgoodgoodgoodbestwordefoobarman";
    String[] words = {"good"};

    // set expected value
    List<Integer> expected = Arrays.asList(12, 16, 20);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5FindSubstring() {
    // test input
    String s = "";
    String[] words = {""};

    // set expected value
    List<Integer> expected = Collections.singletonList(0);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6FindSubstring() {
    // test input
    String s = "far";
    String[] words = {""};

    // set expected value
    List<Integer> expected = Arrays.asList(0, 1, 2, 3);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7FindSubstring() {
    // test input
    String s = "barfoofoobarthefoobarman";
    String[] words = {"bar", "foo", "the"};

    // set expected value
    List<Integer> expected = Arrays.asList(6, 9, 12);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8FindSubstring() {
    // test input
    String s = "wordgoodgoodgoodbestword";
    String[] words = {"word", "good", "best", "good"};

    // set expected value
    List<Integer> expected = Collections.singletonList(8);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9FindSubstring() {
    // test input
    String s = "";
    String[] words = {};

    // set expected value
    List<Integer> expected = Collections.emptyList();

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10FindSubstring() {
    // test input
    String s = "ababaab";
    String[] words = {"ab", "ba", "ba"};

    // set expected value
    List<Integer> expected = Collections.singletonList(1);

    // perform test
    List<Integer> actual = substringWithConcatenationOfAllWords.findSubstring(s, words);

    // assertion
    assertEquals(expected, actual);
  }
}
