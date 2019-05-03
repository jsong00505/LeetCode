package medium.f;

import common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jsong on 2019-05-02.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Find Duplicate Subtrees
 *     (https://leetcode.com/problems/find-duplicate-subtrees/)
 */
public class FindDuplicateSubtrees {
  HashMap<String, Integer> serializedMap = new HashMap<>();
  List<TreeNode> duplicate = new ArrayList<>();

  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    lookup(root);
    return duplicate;
  }

  private String lookup(TreeNode root) {
    if (root == null) {
      return "";
    }
    String serial = root.val + "," + lookup(root.left) + "," + lookup(root.right);
    serializedMap.put(serial, serializedMap.getOrDefault(serial, 0) + 1);
    if (serializedMap.get(serial) == 2) {
      duplicate.add(root);
    }
    return serial;
  }
}
