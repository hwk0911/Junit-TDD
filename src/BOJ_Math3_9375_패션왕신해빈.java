import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class BOJ_Math3_9375_패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> kind;
        String[] temp;
        Iterator<String> strItr;

        for (int index = 0; index < T; ++index) {
            kind = new HashMap<>();
            int answer = 1;
            int loop = Integer.parseInt(br.readLine());

            for(int index_2 = 0 ; index_2 < loop ; ++index_2) {
                temp = br.readLine().split(" ");
                if (kind.containsKey(temp[1])) {
                    kind.put(temp[1], kind.get(temp[1]) + 1);
                } else {
                    kind.put(temp[1], 1);
                }
            }

            strItr = kind.keySet().iterator();
            while(strItr.hasNext()){
                answer *= (kind.get(strItr.next()) + 1);
            }

            System.out.println(answer - 1);
        }
    }
}
