package java15;

public class Factorial {
    public static int FactNum(int num){
        if(num==0 || num==1){
            return 1;
        } else if (num<0) {
            return -1;
        } else {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
}
