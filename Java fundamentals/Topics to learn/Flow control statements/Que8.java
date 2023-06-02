import java.util.Scanner;

public class Que8 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter input:");
        char val = myObj.next().charAt(0);
        switch (val) {
            case 'r' -> System.out.println("Red");
            case 'b' -> System.out.println("Blue");
            case 'g' -> System.out.println("Green");
            case 'o' -> System.out.println("Orange");
            case 'y' -> System.out.println("Yellow");
            case 'w' -> System.out.println("White");
            default -> System.out.println("Invalid Code");
        }
    }
}
