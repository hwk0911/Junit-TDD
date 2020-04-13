import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2748_피보나치수_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
        }
        else if(n == 1) {
            System.out.println(1);
        }
        else {
            reculsive(n, 2, 0, 1);
        }
    }

    public static void reculsive (int n, int tempN, long prev_1, long prev_2) {
        if(n == tempN) {
            System.out.println(prev_1 + prev_2);
            return;
        }

        reculsive(n, tempN + 1, prev_2, prev_1 + prev_2);
    }
}
