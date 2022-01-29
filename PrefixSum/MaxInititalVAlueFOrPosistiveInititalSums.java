public class MaxInititalVAlueFOrPosistiveInititalSums {
  public int solve(int[] nums) {
    int currSum = 0;
    int min = 0;
    for (int num : nums) {
      currSum += num;
      min = Math.min(currSum, min);
    }
    int ans = -min;
    return ans + 1;
  }
}
