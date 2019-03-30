package hard.m;

import common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jsong on 2019-03-29.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Merge k Sorted Lists (https://leetcode.com/problems/merge-k-sorted-lists/)
 */
public class MergeSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (ListNode node : lists) {
      while (node != null) {
        if (map.containsKey(node.val)) {
          map.put(node.val, map.get(node.val) + 1);
        } else {
          map.put(node.val, 1);
        }
        node = node.next;
      }
    }

    List<Integer> vals = new ArrayList<>(map.keySet());
    Collections.sort(vals);

    ListNode result = new ListNode(0);
    ListNode current = result;
    for (int i : vals) {
      int numbers = map.get(i);
      for (int j = 0; j < numbers; j++) {
        current.next = new ListNode(i);
        current = current.next;
      }
    }

    return result.next;
  }
}
