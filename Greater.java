import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = myObj.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = myObj.nextInt();

        if (num1 > num2){
            System.out.println("Num1 is greater");
        } else if (num1 < num2){
            System.out.println("Num2 is Greater");
        } else {
            System.out.println("Equal");
        }
    }
}
