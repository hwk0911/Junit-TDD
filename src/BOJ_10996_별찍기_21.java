import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10996_별찍기_21 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N == 1) {
            System.out.println('*');
            return;
        }
        else {
            pickStar(N, 0);
        }
    }

    public static void pickStar (int N, int tempCount) throws Exception{
        if(N == tempCount) {
            bw.flush();
            bw.close();
            return;
        }
        char star = '*';
        char blank = ' ';

        for(int index = 0 ; index < N ; ++index) {
            if(index % 2 == 0) {
                bw.write(star);
            }
            else {
                bw.write(blank);
            }
        }
        bw.write("\n");

        for(int index = 0 ; index < N ; ++index) {
            if(index % 2 == 1) {
                bw.write(star);
            }
            else {
                bw.write(blank);
            }
        }
        bw.write("\n");

        pickStar(N, tempCount + 1);
    }
}
