public class Que11 {
    public static void main(String[] args){
        int[] nums = {1,4,1};
        int len = nums.length;
        int flag = 0, flag2 = 0;
        for (int i = 0; i < len; i++){
            if (nums[i]==1 || nums[i]==4){
                flag++;
            }
            else{
                flag2++;
            }
        }
        if (flag == len){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
