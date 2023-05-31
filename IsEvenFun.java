import java.util.Scanner;

public class IsEvenFun {
    static int IsEven(int num){
        if (num == 0) {
            return 2;
        } else if (num%2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int i = myObj.nextInt();
        int j = IsEven(i);
        System.out.println(j);
    }
}
