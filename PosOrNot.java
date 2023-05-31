import java.util.Scanner;

public class PosOrNot {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int num = myObj.nextInt();
        if (num == 0){
            System.out.println("Num is Zero");
        } else if (num > 0) {
            System.out.println("Num is +");
        } else {
            System.out.println("Num is -");
        }
    }
}
