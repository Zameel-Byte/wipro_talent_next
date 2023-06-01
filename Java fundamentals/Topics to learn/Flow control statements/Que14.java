public class Que14 {
    public static void main(String[] args){
        int val = 1234;
        int j = 0;
        for (int i = 0; val != 0; i++){
            j += val%10;
            val = val/10;
        }
        System.out.println(j);
    }
}
