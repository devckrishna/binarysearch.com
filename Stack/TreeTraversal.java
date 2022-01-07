import java.util.*;

public class TreeTraversal {
  public class Tree {
    int val;
    Tree left;
    Tree right;
  }

  public int solve(Tree root, String[] moves) {
    Stack<Tree> st = new Stack<>();
    st.push(root);
    for (String curr : moves) {
      if (curr.equals("RIGHT")) {
        st.push(st.peek().right);
      } else if (curr.equals("LEFT")) {
        st.push(st.peek().left);
      } else {
        st.pop();
      }
    }
    return st.peek().val;
  }
}
