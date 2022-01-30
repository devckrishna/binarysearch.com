public class SubtreeWithMaxValue {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  int max = 0;

  public int solve(Tree root) {
    helper(root);
    return max;
  }

  public int helper(Tree root) {
    if (root == null)
      return 0;

    int left = helper(root.left);
    int right = helper(root.right);

    max = Math.max(max, root.val + left + right);
    return root.val + left + right;
  }
}
