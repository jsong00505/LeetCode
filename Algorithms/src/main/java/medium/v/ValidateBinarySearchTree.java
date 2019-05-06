package medium.v;

import common.TreeNode;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Validate Binary Search Tree
 *     (https://leetcode.com/problems/validate-binary-search-tree/)
 */
public class ValidateBinarySearchTree {
  public boolean isValidBST(TreeNode root) {
    return helper(root, null, null);
  }

  private boolean helper(TreeNode root, Integer lower, Integer upper) {
    if (root == null) {
      return true;
    }

    if (lower != null && root.val <= lower) {
      return false;
    }
    if (upper != null && root.val >= upper) {
      return false;
    }

    if (!helper(root.left, lower, root.val)) {
      return false;
    }
    if (!helper(root.right, root.val, upper)) {
      return false;
    }
    return true;
  }
}
