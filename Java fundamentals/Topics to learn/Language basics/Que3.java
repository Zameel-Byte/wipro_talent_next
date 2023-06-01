public class Que3 {
    public static void main(String[] args){
        if (args.length == 2){
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.printf("The Sum of %d and %d is %d%n", i, j, i + j);
        }
    }
}
