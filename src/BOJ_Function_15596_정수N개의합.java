import java.util.Arrays;

public class BOJ_Function_15596_정수N개의합 {
    public long sum(int[] a){
        long result = 0;

        for(int index : a){
            result += index;
        }

        return result;
    }
}
