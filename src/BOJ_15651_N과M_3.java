import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_15651_N과M_3 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int index = 1 ; index <= N ; ++index) {
            backtracking(N, M, 1,index + " ");
        }

        bw.close();
    }

    public static void backtracking (int N, int M, int tempM, String sequence) throws Exception{
        if(M == tempM) {
            bw.write(sequence);
            bw.newLine();
            return;
        }

        for(int index = 1 ; index <= N ; ++index) {
            backtracking(N, M, tempM + 1, sequence + index + " ");
        }
    }
}
