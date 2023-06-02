public class Que8 {
    public static void main(String[] args){
        int[] nums = {10,3,6,1,2,7,9};
        int len = nums.length;
        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 6) {
                ignore = true;
            }
            if (!ignore) {
                sum += nums[i];
            }
            if (nums[i] == 7 && ignore) {
                ignore = false;
            }
        }
        System.out.println(sum);
    }
}
