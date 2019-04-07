package medium.g;

import java.util.*;

/**
 * Created by jsong on 2019-04-06.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Group Anagrams (https://leetcode.com/problems/group-anagrams/)
 */
public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<Integer> primeNumbers = getPrimeNumbers(new ArrayList<>());
    HashMap<Integer, List<String>> map = new HashMap<>();
    for (String str : strs) {
      int encrypt = 1;
      for (char c : str.toCharArray()) {
        encrypt *= primeNumbers.get(c - 'a');
      }
      if (!map.containsKey(encrypt)) {
        map.put(encrypt, new ArrayList<>());
      }
      map.get(encrypt).add(str);
    }
    return new ArrayList<>(map.values());
  }

  private List<Integer> getPrimeNumbers(List<Integer> primeNumbers) {

    boolean[] prime = new boolean[104];
    Arrays.fill(prime, true);

    int max = 104;
    for (int i = 2; i < max; i++) {
      if (!prime[i]) {
        continue;
      }
      primeNumbers.add(i);
      for (int j = i + i; j < 104; j += i) {
        prime[j] = false;
      }
    }

    return primeNumbers;
  }

  public List<List<String>> myOwnSolution(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] strCharArray = str.toCharArray();
      Arrays.sort(strCharArray);
      String copyString = new String(strCharArray);
      if (!map.containsKey(copyString)) {
        map.put(copyString, new ArrayList<>());
      }
      map.get(copyString).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
