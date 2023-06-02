public class Que2 {
    public static void main(String[] args){
        int[] nums = {27,95,26,54,26,58,26,19,3,7,54,6};
        int len = nums.length;
        int low = nums[0], hig = 0;
        for (int i = 0; i<= len-1; i++){
            if (nums[i] > hig){
                hig = nums[i];
            }
            if (nums[i] < low){
                low = nums[i];
            }
        }
        System.out.println("Min is "+low+" Max is "+hig);
    }
}
