package medium.l;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class LetterCombinationsPhoneNumberTest {

  private LetterCombinationsPhoneNumber letterCombinationsPhoneNumber;

  @Before
  public void setUp() {
    letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
  }

  @Test
  public void test1LetterCombinations() {
    // test input
    String digits = "23";

    // set expected value
    List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

    // perform test
    List<String> actual = letterCombinationsPhoneNumber.letterCombinations(digits);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test2LetterCombinations() {
    // test input
    String digits = "237";

    // set expected value
    List<String> expected =
        Arrays.asList(
            "adp", "adq", "adr", "ads", "aep", "aeq", "aer", "aes", "afp", "afq", "afr", "afs",
            "bdp", "bdq", "bdr", "bds", "bep", "beq", "ber", "bes", "bfp", "bfq", "bfr", "bfs",
            "cdp", "cdq", "cdr", "cds", "cep", "ceq", "cer", "ces", "cfp", "cfq", "cfr", "cfs");

    // perform test
    List<String> actual = letterCombinationsPhoneNumber.letterCombinations(digits);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }
}
