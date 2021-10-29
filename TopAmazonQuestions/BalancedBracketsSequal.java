import java.util.Stack;

public class BalancedBracketsSequal {
  public boolean solve(String s) {
    Stack<Character> st = new Stack<>();
    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') {
        st.push(ch);
      } else {
        // System.out.println("here-------: " + ch);
        if (st.isEmpty()) {
          return false;
        } else if ((ch == ')' && st.peek() == '(') || (ch == ']' && st.peek() == '[')
            || (ch == '}' && st.peek() == '{')) {
          st.pop();
        } else {
          return false;
        }
      }
    }
    return st.isEmpty();
  }
}
