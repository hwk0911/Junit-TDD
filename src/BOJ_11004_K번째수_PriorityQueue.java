import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_11004_K번째수_PriorityQueue {
    public static void main(String[] args) throws Exception{
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            priorityQueue.offer(Integer.parseInt(st.nextToken()));
        }

        for(int index = 0 ; index < N ; ++index) {
            if(index + 1 == M) {
                System.out.println(priorityQueue.poll());
                return;
            }

            priorityQueue.poll();
        }
    }
}
