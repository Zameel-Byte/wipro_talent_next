import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int i,m,flag=0;
        System.out.println("Enter Number");
        int n = myObj.nextInt();
        m=n/2;
        if(n==0||n==1) System.out.println(n + " is not prime number");
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(0 == flag)  { System.out.println(n+" is prime number"); }
        }
    }
}
