package java15;

public class SwapNum {
    public static int[] Swap(int num1, int num2){
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 /= num2;

        return new int[]{num1, num2};
    }
}
