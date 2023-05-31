import java.util.Scanner;

public class UnitDig {
    static int LastDigit(int num){
        int i =  num%10;
        if (i < 0 ){
            return -1*i;
        } else {
            return i;
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number:");
        int i = myObj.nextInt();
        System.out.println(LastDigit(i));
    }
}
