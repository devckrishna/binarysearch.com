public class LongestAPTreePath {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  private int max = 0;

  public int solve(Tree root) {
    if (root == null) {
      return 0;
    } else if (root.left == null && root.right == null) {
      return 1;
    }
    getMaxSequence(root.left, root.val, null, 0);
    getMaxSequence(root.right, root.val, null, 0);
    return max;
  }

  public void getMaxSequence(Tree root, Integer prev, Integer diff, Integer counter) {
    if (root == null) {
      return;
    }

    int currentDiff = root.val - prev;
    if (diff == null || diff != currentDiff) {
      diff = currentDiff;
      counter = 2;
    } else if (diff == currentDiff) {
      counter++;
    }

    max = Math.max(max, counter);
    getMaxSequence(root.left, root.val, diff, counter);
    getMaxSequence(root.right, root.val, diff, counter);
  }
}
