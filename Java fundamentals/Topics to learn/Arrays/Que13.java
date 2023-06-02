public class Que13 {
    public static void main(String[] args){
        if (args.length <= 3){
            System.out.println("Please enter 4 integer numbers");
        } else {
            int[][] vals = new int[2][2];
            int[][] out = new int[2][2];

            vals[0][0] = Integer.parseInt(args[0]);
            vals[0][1] = Integer.parseInt(args[1]);
            vals[1][0] = Integer.parseInt(args[2]);
            vals[1][1] = Integer.parseInt(args[3]);

            System.out.println("The given array is :");
            for (int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    System.out.print(vals[i][j]+" ");
                }
                System.out.println();
            }
            out[0][0] = vals[1][1];
            out[0][1] = vals[1][0];
            out[1][0] = vals[0][1];
            out[1][1] = vals[0][0];
            System.out.println("The reverse of the array is :");
            for (int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    System.out.print(out[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
