import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018_체스판다시칠하기 {
    static StringBuilder mask = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int gap = M - 8;
        setStringBuilder(M - 8);

        StringBuilder target = new StringBuilder();

        do {
            target.append(br.readLine());
            // 9 * 8 같은 경우를 체크할것.
        } while (br.ready());

        int answer = optimizeCount(target, gap);

        System.out.println(answer);
    }

    public static void setStringBuilder(int gap) {
        String blank = "";

        for(int index = 0 ; index < gap ; ++index) {
            blank += " ";
        }

        for(int index = 0 ; index < 4 ; ++index) {
            mask.append("BWBWBWBW");
            mask.append(blank);
            mask.append("WBWBWBWB");

            if(index != 3) {
                mask.append(blank);
            }
        }

        return;
    }

    public static int optimizeCount(StringBuilder target, int gap) {
        int BCount = Integer.MAX_VALUE;

        for (int index = 0 ; index <= gap ; ++index) {
            int tempBCount = 0;
            int tempWCount = 0;

            for(int index_2 = 0, size = mask.length(); index_2 < size; ++index_2) {
                if(mask.charAt(index_2) == ' ') {
                    continue;
                }
                else if(mask.charAt(index_2) != target.charAt(index_2 + index)) {
                    ++tempBCount;
                }
            }
            tempBCount = Math.min(tempBCount, 64 - tempBCount);
            BCount = Math.min(BCount, tempBCount);

        }

        return BCount;
    }
}