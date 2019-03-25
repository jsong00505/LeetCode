package medium.l;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

  private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

  @Before
  public void setUp() {
    longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
  }

  @Test
  public void test1LengthOfLongestSubstring() {
    // test input
    String s = "abcabcbb";

    // set expected value
    int expected = 3;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test2LengthOfLongestSubstring() {
    // test input
    String s = "bbbbb";

    // set expected value
    int expected = 1;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test3LengthOfLongestSubstring() {
    // test input
    String s = "pwwkew";

    // set expected value
    int expected = 3;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test4LengthOfLongestSubstring() {
    // test input
    String s = " ";

    // set expected value
    int expected = 1;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test5LengthOfLongestSubstring() {
    // test input
    String s = "";

    // set expected value
    int expected = 0;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test6LengthOfLongestSubstring() {
    // test input
    String s = "au";

    // set expected value
    int expected = 2;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test7LengthOfLongestSubstring() {
    // test input
    String s = "aab";

    // set expected value
    int expected = 2;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test8LengthOfLongestSubstring() {
    // test input
    String s = "ynyo";

    // set expected value
    int expected = 3;

    // perform test
    int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    // assertions
    assertEquals(expected, actual);
  }
}
