import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Num:");
        int num = myObj.nextInt();
        if (num%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
