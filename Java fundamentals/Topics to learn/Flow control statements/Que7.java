public class Que7 {
    public static void main(String[] args){
        char val = 'A';
        String inp = String.valueOf(val);
        if (Character.isLowerCase(val)){
            System.out.println(val+"->"+inp.toUpperCase());
        }
        if (Character.isUpperCase(val)){
            System.out.println(val+"->"+inp.toLowerCase());
        }
    }
}
