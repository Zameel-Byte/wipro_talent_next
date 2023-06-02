public class Que9 {
    public static void main(String[] args){
        int[] nums = {10,2,10};
        int len = nums.length;
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (nums[j] != 10) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < len) {
            nums[i] = 0;
            i++;
        }
        for (int x = 0; x < len; x++){
            System.out.print(nums[x]+" ");
        }
        System.out.print("\b");
    }
}
