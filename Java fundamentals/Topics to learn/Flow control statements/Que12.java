public class Que12 {
    public static void main(String[] args){
        int i,m,flag=0;
        int n = 2;
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
