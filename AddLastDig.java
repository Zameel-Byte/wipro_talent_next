import java.util.Scanner;

public class AddLastDig {
    static int addLastDigits(int num1, int num2){
        if (num1 < 0){
            num1 = -1 * num1;
        }
        if (num2 < 0){
            num2 = -1 * num2;
        }
        return (num1%10) + (num2%10);
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int i = myObj.nextInt();
        System.out.println("Enter Number2:");
        int j = myObj.nextInt();
        System.out.println(addLastDigits(i,j));
    }
}
