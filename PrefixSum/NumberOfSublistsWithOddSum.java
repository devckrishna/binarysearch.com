public class NumberOfSublistsWithOddSum {
  public int solve(int[] nums) {
    int odd = 0;
    int even = 1;
    int sum = 0;
    long ans = 0;
    for (int num : nums) {
      sum += num;
      if (sum % 2 == 0) {
        ans += odd;
        even++;
      } else {
        ans += even;
        odd++;
      }
    }
    return (int) (ans % 1000000007);
  }
}
