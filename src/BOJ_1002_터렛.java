import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1002_터렛 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int index = 0; index < T; ++index) {
            String[] readLine = br.readLine().split(" ");
            int x1 = Integer.parseInt(readLine[0]);
            int y1 = Integer.parseInt(readLine[1]);
            int r1 = Integer.parseInt(readLine[2]);
            int x2 = Integer.parseInt(readLine[3]);
            int y2 = Integer.parseInt(readLine[4]);
            int r2 = Integer.parseInt(readLine[5]);

            double distance = getLength(x1, y1, x2, y2);
            double sumR = getAbsoluteValue(r1 + r2);
            double subR = getAbsoluteValue(r1 - r2);

            if(distance == 0) {
                if(r1 == r2) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if(distance < sumR && subR < distance) {
                System.out.println(2);
            }
            else if(distance == sumR) {
                System.out.println(1);
            }
            else if(distance == subR && distance != 0) {
                System.out.println(1);
            }
            else if(distance < subR || distance > sumR) {
                System.out.println(0);
            }
        }
    }

    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static int getAbsoluteValue(int x) {
        if (x < 0) {
            x *= -1;
        }

        return x;
    }
}

/*
자연수라 해서 0을 제외하고 알고리즘을 작성했는데,
연속으로 틀려 혹시나 해서 0을 처리해서 풀었더니 정답이었다.
후...
 */
