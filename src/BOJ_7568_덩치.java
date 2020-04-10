import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_7568_덩치 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayList<Integer> height = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();

        for(int index = 0 ; index < N ; ++index) {
            st = new StringTokenizer(br.readLine());

            height.add(Integer.parseInt(st.nextToken()));
            weight.add(Integer.parseInt(st.nextToken()));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int index = 0 ; index < N ; ++index) {
            int rank = 1;

            for(int index_2 = 0 ; index_2 < N ; ++index_2) {
                if(height.get(index) < height.get(index_2)) {
                    if(weight.get(index) < weight.get(index_2)) {
                        ++rank;
                    }
                }
            }

            bw.write(rank + " ");
        }

        bw.flush();
    }
}

/*
Collections.sort(bigList, new Comparator<Big>() {
            @Override
            public int compare(Big o1, Big o2) {
                if(o1.getHeight() > o2.getHeight()) {
                    if(o1.getWeight() > o2.getWeight()) {
                        return -1;
                    }
                    else if(o1.getWeight() < o2.getHeight()) {
                        return 0;
                    }
                    else {
                        return -1;
                    }
                }
                else if(o1.getHeight() < o2.getHeight()) {
                    if(o1.getWeight() > o2.getWeight()) {
                        return 0;
                    }
                    else if(o1.getWeight() < o2.getHeight()) {
                        return 1;
                    }
                    else {
                        return 1;
                    }
                }
                else {
                    if(o1.getWeight() > o2.getWeight()) {
                        return -1;
                    }
                    else if(o1.getWeight() < o2.getHeight()) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        });
 */