import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1436_영화감독숌 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(Integer index = 666 ; index < 9999667 ; ++index) {
            if(index.toString().contains("666")) {
                ++count;
            }

            if(N == count) {
                System.out.println(index);
                break;
            }
        }
    }
}
