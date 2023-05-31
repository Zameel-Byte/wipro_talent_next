import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Num1:");
        int num1 = myObj.nextInt();
        System.out.println("Enter Num2:");
        int num2 = myObj.nextInt();
        int sum = num1 + num2;
        if (sum%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
