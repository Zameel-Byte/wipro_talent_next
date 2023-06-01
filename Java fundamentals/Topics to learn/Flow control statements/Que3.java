public class Que3 {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("No value");
        } else {
            int len = args.length;
            for (int i = 0; i <= len-1; i++){
                System.out.print(args[i]);
                System.out.print(",");
            }
            System.out.print("\b");
        }
    }
}
