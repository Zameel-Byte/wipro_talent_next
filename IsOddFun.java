import java.util.Scanner;

public class IsOddFun {
    static int IsOdd(int num){
        if (num == 0) {
            return 1;
        } else if (num%2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int i = myObj.nextInt();
        int j = IsOdd(i);
        System.out.println(j);
    }
}
