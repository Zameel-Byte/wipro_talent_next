public class Que4 {
    public static void main(String[] args){
        char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};
        char val1 = 'a';
        char val2 = 'z';
        int len = alp.length;
        int index1 = 0,index2=0;
        for (int i = 0; i<=len-1; i++){
            if(val1 == alp[i]){
                index1 = i;
            }
            if (val2 == alp[i]){
                index2 = i;
            }
        }
        if (index1 < index2){
            System.out.println(val1+","+val2);
        }else {
            System.out.println(val2+","+val1);
        }
    }
}
