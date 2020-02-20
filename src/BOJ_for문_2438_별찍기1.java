import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_for문_2438_별찍기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strStar = new String[N];
        strStar[0] = "*";

        for (int index = 1; index < N; ++index) {
            strStar[index] = strStar[index - 1] + "*";
        }

        for (String str : strStar) {
            System.out.println(str);
        }
    }
}
