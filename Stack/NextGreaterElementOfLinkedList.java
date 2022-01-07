import java.util.Stack;

public class NextGreaterElementOfLinkedList {
  class LLNode {
    int val;
    LLNode next;
  }

  Stack<Integer> stack = new Stack<Integer>();

  public LLNode solve(LLNode node) {
    if (node == null)
      return null;

    solve(node.next);

    while (!stack.isEmpty() && node.val >= stack.peek())
      stack.pop();

    int val = node.val;
    node.val = stack.isEmpty() ? 0 : stack.peek();
    stack.push(val);

    return node;
  }
}
