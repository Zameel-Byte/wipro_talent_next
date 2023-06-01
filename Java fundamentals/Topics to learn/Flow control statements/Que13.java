public class Que13 {
    public static void main(String[] args){
        int i,m,flag=0;
        for (int n = 10; n<=99; n++){
            m=n/2;
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(0 == flag)  { System.out.println(n); }
        }
    }
}
