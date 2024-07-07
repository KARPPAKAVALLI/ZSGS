package Array2;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int[] a = new int[nums.length];
        int c = 0;

        for (int num : nums) {
            if (num == 0) {
                a[c++] = 0;
            }
        }

        for (int num : nums) {
            if (num != 0) {
                a[c++] = num;
            }
        }

        return a;
    }
}
