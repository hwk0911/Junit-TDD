import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_BackTrackking_15649_N과M {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> data = new ArrayList<>();

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);

        for (Integer index = 1; index < N + 1; ++index)
        {
            data.add(index.toString());
        }

        boolean[] visited = new boolean[data.size()];

        recursion(visited, M, 0, data, "");
    }

    public static void recursion(boolean[] visited, int M, int count, ArrayList<String> data, String sequence)
    {
        //termination check
        if (M == count)
        {
            System.out.println(sequence);
            return;
        }

        //recurse next
        for (int index = 0, size = data.size(); index < size; ++index)
        {
            if (!visited[index])
            {
                visited[index] = !visited[index];
                recursion(visited, M, count + 1, data, sequence + data.get(index) + " ");
                visited[index] = !visited[index];
            }
        }
    }
}