import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.PriorityQueue;

public class BOJ_구현_1764_듣보잡 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> noListen = new HashSet<>();

        for(int index = 0 ; index < N ; ++index) {
            noListen.add(br.readLine());
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        for(int index = 0 ; index < M ; ++index) {
            String noSee = br.readLine();

            if(noListen.contains(noSee)) {
                priorityQueue.offer(noSee);
            }
        }

        bw.write(priorityQueue.size() + "");
        bw.newLine();

        while(!priorityQueue.isEmpty()) {
            bw.write(priorityQueue.poll());
            bw.newLine();
        }

        bw.close();
    }


    /* 1차 시도
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for(int index = 0 ; index < N ; ++index) {
            sb.append(br.readLine());
        }

        int count = 0;

        for(int index = 0 ; index < M ; ++index) {
            String contain = br.readLine();

            if(sb.toString().contains(contain)) {
                ++count;
                bw.write(contain);
                bw.newLine();
            }
        }

        System.out.println(count);
        bw.close();
    }
     */
}
