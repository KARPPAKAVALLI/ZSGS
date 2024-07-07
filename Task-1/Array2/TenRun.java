package Array2;

public class TenRun {
    public int[] tenRun(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int[] result = new int[nums.length];
        int target = nums[0];
        boolean changing = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                target = nums[i];
                changing = true;
            }

            if (changing) {
                result[i] = target;
            } else {
                result[i] = nums[i];
            }
        }

        return result;
    }
}
