public class Que10 {
    public static void main(String[] args){
        int[] nums = {1,0,1,0,0,1,1};
        int len = nums.length;
        int[] temp = new int[len];
        int j = 0;
        for (int i = 0; i < len; i++){
            if (nums[i]%2 == 0){
                temp[j++] = nums[i];
            }
        }
        for (int i = 0; i < len; i++){
            if (nums[i]%2 != 0){
                temp[j++] = nums[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
