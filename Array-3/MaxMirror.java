public class MaxMirror {
    public int maxMirror(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int s = i;
                int e = j;
                int len = 0;

                while (s < nums.length && e >= 0 && nums[s] == nums[e]) {
                    len++;
                    s++;
                    e--;
                }

                max = Math.max(max, len);
            }
        }

        return max;
    }
}
