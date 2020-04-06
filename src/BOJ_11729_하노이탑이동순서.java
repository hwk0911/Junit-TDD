import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_11729_하노이탑이동순서 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Double moveCount = Math.pow(2, N) - 1;
        bw.write(moveCount.intValue() + "\n");

        reculsion(N, 1, 3);
        bw.flush();
    }

    public static void reculsion (int N, int from, int to) throws Exception{
        if(N == 0) {
            return;
        }

        reculsion(N - 1, from, 6 - from - to);
        bw.write(from + " " + to + "\n");
        reculsion(N - 1, 6 - from - to, to);
    }
}
