public class Que3 {
    public static void main(String[] args){
        int[] nums = {1,4,34,56,7};
        int len = nums.length;
        int val = 7, count = 0;
        boolean flag = false;
        for (int i = 0; i<len; i++){
            count++;
            if (val == nums[i]){
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag){
            count--;
            System.out.println("Found at index "+count);
        } else {
            System.out.println("-1");
        }
    }
}
