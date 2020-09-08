import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_9663_N_Queen {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());

        int[] queens = new int[N];
        Arrays.fill(queens, 0);

        backTrackking(N, 0, queens, new boolean[N]);

        System.out.println(count);
    }

    public static void backTrackking(int N, int line, int[] queens, boolean[] visited) {
        if (line == N) {
            ++count;
            return;
        }
        for (int index = 0, size = visited.length; index < size; ++index) {
            if(!visited[index]) {
                visited[index] = !visited[index];
                queens[line] = index;
                if(check(queens, line)) {
                    backTrackking(N, line + 1, queens, visited);
                }
                visited[index] = !visited[index];
            }
        }
    }

    public static boolean check(int[] queens, int line) {
        for (int index = 0; index < line; ++index) {
            for (int index_2 = index + 1; index_2 < line + 1; ++index_2) {
                int x = queens[index] - queens[index_2];
                int y = index_2 - index;

                if(Math.abs(x) == y) {
                    return false;
                }
            }
        }
        return true;
    }
}
