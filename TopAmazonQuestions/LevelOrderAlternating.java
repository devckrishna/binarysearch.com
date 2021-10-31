import java.util.*;

public class LevelOrderAlternating {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  public int[] solve(Tree root) {
    List<List<Integer>> arr = new ArrayList<>();

    if (root == null)
      return new int[] {};

    boolean left = true;
    Deque<Tree> dq = new LinkedList<>();
    dq.addFirst(root);

    int len = 0;
    while (!dq.isEmpty()) {
      int size = dq.size();
      LinkedList<Integer> result = new LinkedList<>();
      while (size-- > 0) {
        Tree node = dq.removeFirst();
        if (left) {
          result.addLast(node.val);
        } else {
          result.addFirst(node.val);
        }

        if (node.left != null) {
          dq.addLast(node.left);
        }

        if (node.right != null) {
          dq.addLast(node.right);
        }
      }

      left = !left;
      arr.add(result);
      len += result.size();
    }
    int[] ans = new int[len];
    int index = 0;
    for (List<Integer> curr : arr) {
      for (int i : curr) {
        ans[index] = i;
        index++;
      }
    }
    return ans;
  }
}
