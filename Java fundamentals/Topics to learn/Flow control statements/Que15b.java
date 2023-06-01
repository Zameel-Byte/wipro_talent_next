public class Que15b {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
        } else {
            int rows = Integer.parseInt(args[0]);
            int number =1, counter = 0;
            while (number <= rows) {
                counter = 1;
                while (counter <= number) {
                    System.out.print("* ");
                    counter++;
                }
                System.out.println();
                number++;
            }
        }
    }
}
