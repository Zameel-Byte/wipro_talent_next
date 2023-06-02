public class Que6 {
    public static void main(String[] args) {
        int[] nums = {27, 95, 26, 54, 26, 58, 26, 19, 3, 7, 54, 6};
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = 0;
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            System.out.print(nums[i]+"\t");
        }
    }
}
