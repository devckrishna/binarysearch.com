import java.util.*;

public class StackSequence {
  public boolean solve(int[] pushes, int[] pops) {
    Stack<Integer> st = new Stack<>();
    int index = 0;
    for (int i = 0; i < pushes.length; i++) {
      st.push(pushes[i]);
      while (!st.isEmpty() && index < pops.length && st.peek() == pops[index]) {
        st.pop();
        index++;
      }
    }
    return index == pops.length;
  }
}