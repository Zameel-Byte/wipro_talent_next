public class Que5 {
    public static void main(String[] args){
        char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        var val = 'z';
        boolean Alp=false, Dig=false;
        for (int i = 0; i<=alp.length - 1; i++){
            if (val == alp[i]){
                Alp = true;
                break;
            }
        }
        for (int i = 0; i<=num.length-1; i++){
            if (val == num[i]){
                Dig = true;
                break;
            }
        }
        if (Alp == true){
            System.out.println("Alphabet");
        } else if (Dig == true) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
