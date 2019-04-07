package medium.g;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

  private GroupAnagrams groupAnagrams;

  @Before
  public void setUp() {
    groupAnagrams = new GroupAnagrams();
  }

  @Test
  public void test1GroupAnagrams() {
    // test input
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

    // set expected value
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList("eat", "tea", "ate"));
    expected.add(Arrays.asList("tan", "nat"));
    expected.add(Arrays.asList("bat"));

    // perform test
    List<List<String>> actual = groupAnagrams.groupAnagrams(strs);

    assertEquals(expected, actual);
  }
}
