public class Que7 {
    public static void main(String[] args) {
        int[] nums = {12, 34, 12, 45, 67, 89};
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
        }
        int[] temp = new int[len];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[len - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
