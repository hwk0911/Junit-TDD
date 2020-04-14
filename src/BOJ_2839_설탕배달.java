import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2839_설탕배달 {
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        reculsive(N);
    }

    public static void reculsive (int N) {
        if (N == 0) {
            System.out.println(count);
            return;
        }
        else if (N < 3) {
            System.out.println(-1);
            return;
        }

        if(N % 5 == 0) {
            count += N / 5;
            N %= 5;
        }
        else {
            ++count;
            N -= 3;
        }

        reculsive(N);
    }
}