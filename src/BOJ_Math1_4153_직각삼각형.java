import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_Math1_4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] length = new int[3];
        String[] strLength;
        String temp;
        while (!(temp = br.readLine()).equals("0 0 0")) {
            strLength = temp.split(" ");
            length[0] = Integer.parseInt(strLength[0]);
            length[1] = Integer.parseInt(strLength[1]);
            length[2] = Integer.parseInt(strLength[2]);

            Arrays.sort(length);

            System.out.println((Math.pow(length[0], 2) + Math.pow(length[1], 2) == Math.pow(length[2], 2) ? "right" : "wrong"));
        }
    }
}
