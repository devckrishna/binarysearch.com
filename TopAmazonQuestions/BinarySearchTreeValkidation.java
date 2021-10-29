public class BinarySearchTreeValkidation {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  public boolean helper(Tree root, int min, int max) {
    if (root == null) {
      return true;
    }
    if (root.val < min || root.val > max) {
      return false;
    }

    return helper(root.left, min, root.val) && helper(root.right, root.val, max);
  }

  public boolean solve(Tree root) {
    return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
}
