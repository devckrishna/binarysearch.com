import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  public int[] solve(Tree root) {
    Queue<Tree> qu = new LinkedList<>();
    qu.add(root);
    List<Integer> ans = new ArrayList<>();
    while (!qu.isEmpty()) {
      int size = qu.size();
      while (size-- > 0) {
        Tree curr = qu.remove();
        ans.add(curr.val);
        if (curr.left != null) {
          qu.add(curr.left);
        }
        if (curr.right != null) {
          qu.add(curr.right);
        }
      }
    }
    int[] arr = new int[ans.size()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans.get(i);
    }
    return arr;
  }
}
