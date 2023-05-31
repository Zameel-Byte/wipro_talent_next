import java.util.Scanner;

public class TenthDig {
    static int TenthDigit(int num){
        if (-10 < num || num > 10){
            return -1;
        }
        else if (num < 10) {
            num = num/10;
            return -1*num%10;
        } else {
            num = num/10;
            return num%10;
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number:");
        int i = myObj.nextInt();
        System.out.println(TenthDigit(i));
    }
}
