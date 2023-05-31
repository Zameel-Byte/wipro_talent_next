import java.lang.Math;
public class CubesSquares {
    public static void main(String[] args){
        int i, sq = 0, cq =0, Sum;
        for (i = 1; i<=50; i++){
            if (i%2 == 0){
                cq += Math.pow(i, 3);
            }
            else{
                sq += Math.pow(i, 2);
            }
        }
        Sum = cq + sq;
        System.out.println("Total :"+ Sum);
        System.out.println("Cubes :"+ cq);
        System.out.println("Squares :"+ sq);
    }
}
