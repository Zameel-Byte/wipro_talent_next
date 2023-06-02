public class Que14 {
    public static void main(String[] args) {
        if (args.length <= 8) {
            System.out.println("Please enter 9 integer inputs");
        } else {
            int[][] vals = new int[3][3];

            vals[0][0] = Integer.parseInt(args[0]);
            vals[0][1] = Integer.parseInt(args[1]);
            vals[0][2] = Integer.parseInt(args[2]);
            vals[1][0] = Integer.parseInt(args[3]);
            vals[1][1] = Integer.parseInt(args[4]);
            vals[1][2] = Integer.parseInt(args[5]);
            vals[2][0] = Integer.parseInt(args[6]);
            vals[2][1] = Integer.parseInt(args[7]);
            vals[2][2] = Integer.parseInt(args[8]);

            System.out.println("The given array is :");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(vals[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("The biggest number in the given array is ");
            int max = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (vals[i][j] > max){
                        max = vals[i][j];
                    }
                }
            }
            System.out.print(max);
        }
    }
}