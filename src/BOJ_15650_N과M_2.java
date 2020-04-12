import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_15650_N과M_2 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        backTracking(N, M, 0, 1, "");

        bw.flush();
    }

    public static void backTracking(int N, int M, int tempM, int number, String sequence) throws Exception {
        if (tempM == M) {
            bw.write(sequence);
            bw.newLine();
            return;
        }

        for (int index = number; index <= N; ++index) {
            backTracking(N, M, tempM + 1, index + 1, sequence + index + " ");
        }
    }
}
