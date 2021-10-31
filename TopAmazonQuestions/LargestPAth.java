public class LargestPAth {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  int ans = 0;

  public int solve(Tree root) {
    if (root == null) {
      return 0;
    }
    helper(root);
    return ans + 1;
  }

  public int helper(Tree root) {
    if (root == null) {
      return 0;
    }
    int left = helper(root.left);
    int right = helper(root.right);

    ans = Math.max(left + right, ans);
    return Math.max(left, right) + 1;
  }
}
