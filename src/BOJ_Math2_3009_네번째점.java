import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Math2_3009_네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] point = new int[3][2];
        String[] strPoint;

        for(int index = 0, size = point.length ; index < size ; ++index){
            strPoint = br.readLine().split(" ");
            point[index][0] = Integer.parseInt(strPoint[0]);
            point[index][1] = Integer.parseInt(strPoint[1]);
        }

        point[0][0] = point[0][0]^point[1][0]^point[2][0];
        point[0][1] = point[0][1]^point[1][1]^point[2][1];

        System.out.println(point[0][0] + " " + point[0][1]);
    }
}
