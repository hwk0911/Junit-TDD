import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_BackTrackking_1_N과M {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> data = new ArrayList<>();

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        //Integer[] size = Integer.parseInt(br.readLine().split(" "));

        for(Integer index = N ; index < M + 1 ; ++index) {
            data.add(index.toString());
        }

        boolean[] visited = new boolean[data.size()];

        recursion(visited, 0, data, "");
    }

    public static void recursion(boolean[] visited, int n, ArrayList<String> data, String sequence) {
        if (n == data.size()) {
            System.out.println(sequence);
            return;
        }

        for (int index = 0, size = data.size(); index < size; ++index) {
            if(!visited[index]){
                visited[index] = !visited[index];
                recursion(visited, n, data, sequence + data.get(index));
                visited[index] = !visited[index];
            }
        }
    }
}