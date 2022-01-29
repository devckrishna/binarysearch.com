import java.util.*;

public class FindLocalPeaksSequal {
  public int[] solve(int[] nums) {
    List<Integer> list = new ArrayList<>();

    int len = nums.length, lPrev = nums[0], rPrev = nums[len - 1];
    int[] left = new int[len], right = new int[len];

    left[0] = Integer.MIN_VALUE;
    right[len - 1] = Integer.MIN_VALUE;

    for (int i = 1; i < len; i++) {
      if (nums[i] == lPrev)
        left[i] = left[i - 1];
      else
        left[i] = lPrev;

      if (nums[len - 1 - i] == rPrev)
        right[len - 1 - i] = right[len - i];
      else
        right[len - 1 - i] = rPrev;

      lPrev = nums[i];
      rPrev = nums[len - 1 - i];
    }

    for (int i = 0; i < len; i++) {
      if (nums[i] > left[i] && nums[i] > right[i]
          && (left[i] != Integer.MIN_VALUE || right[i] != Integer.MIN_VALUE))
        list.add(i);
    }

    int[] res = new int[list.size()];
    for (int i = 0; i < res.length; i++)
      res[i] = list.get(i);
    return res;
  }
}
