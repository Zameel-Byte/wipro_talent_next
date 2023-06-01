public class Que6 {
    public static void main(String[] args){
        String gender = null;
        int age = 0;
        if (args.length == 2){
            gender = args[0];
            age = Integer.parseInt(args[1]);
        }
        if (gender.equals("Male")){
            if (1<=age && age<=58){
                System.out.println("the percentage of interest is 8.4%");
            }
        }
        if (gender.equals("Male")){
            if (59<=age && age<=100){
                System.out.println("the percentage of interest is 10.5%");
            }
        }
        if (gender.equals("Female")){
            if (1<=age && age<=58){
                System.out.println("the percentage of interest is 8.2%");
            }
        }
        if (gender.equals("Female")){
            if (59<=age && age<=100){
                System.out.println("the percentage of interest is 9.2%");
            }
        }
    }
}
