public class NumberOfHopes {
  public int solve(int[] nums) {
    if (nums.length <= 1) {
      return 0;
    }
    int curr = 0;
    int end = 0;
    int index = 0;
    int jump = 1;
    while (index <= end) {
      end = Math.max(end, index + nums[index]);
      if (end >= nums.length - 1) {
        return jump;
      }
      if (index == curr) {
        jump++;
        curr = end;
      }
      index++;
    }
    return -1;
  }
}
