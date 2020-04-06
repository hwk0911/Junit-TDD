import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_14681_사분면고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println(selectQuadrant(x, y));
    }

    public static int selectQuadrant (int x, int y) {
        if(x * y > 0) {
            if(x < 0) {
                return 3;
            }
            else {
                return 1;
            }
        }
        else {
            if(x < 0) {
                return 2;
            }
            else {
                return 4;
            }
        }
    }
}
