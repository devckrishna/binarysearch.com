public class InsertIntoLinkedList {
  class LLNode {
    int val;
    LLNode next;

    public LLNode(int val) {
      this.val = val;
    }
  }

  public LLNode solve(LLNode head, int pos, int val) {
    if (pos == 0) {
      LLNode curr = new LLNode(val);
      curr.next = head;
      return curr;
    }
    LLNode newNode = new LLNode(val);
    LLNode curr = head;
    int index = 0;
    while (index < pos - 1 && head != null) {
      curr = curr.next;
      index++;
    }
    LLNode prev = curr.next;
    curr.next = newNode;
    newNode.next = prev;
    return head;
  }
}
