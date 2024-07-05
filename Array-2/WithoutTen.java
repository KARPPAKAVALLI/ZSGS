public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int[] a = new int[nums.length];
        int i = 0;

        for (int num : nums) {
            if (num != 10) {
                a[i++] = num;
            }
        }

        return a;
    }
}
