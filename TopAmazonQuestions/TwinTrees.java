
public class TwinTrees {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  public boolean solve(Tree root0, Tree root1) {
    if (root0 == null && root1 == null)
      return true;

    if (root0 == null || root1 == null)
      return false;

    if (root0.val != root1.val)
      return false;

    return solve(root0.left, root1.left) && solve(root0.right, root1.right);
  }

  // ALTERNATE
  // public void helper(Tree root, List<Integer> arr) {
  // if (root == null) {
  // return;
  // }
  // helper(root.left, arr);
  // arr.add(root.val);
  // helper(root.right, arr);
  // }

  // public boolean solve(Tree root0, Tree root1) {
  // List<Integer> first = new ArrayList<>();
  // List<Integer> second = new ArrayList<>();
  // helper(root0, first);
  // helper(root1, second);
  // if (first.size() != second.size()) {
  // return false;
  // }
  // for (int i = 0; i < first.size(); i++) {
  // if (first.get(i) != second.get(i)) {
  // return false;
  // }
  // }
  // return true;
  // }
}
