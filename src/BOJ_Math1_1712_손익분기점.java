import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Math1_1712_손익분기점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");

        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int C = Integer.parseInt(data[2]);

        if(B >= C){
            System.out.println(-1);
        }
        else{
            System.out.println(A / (C - B) + 1);
        }
    }
}
/*
A의 고정비용 / Y
B의 가변비용 / EA
노트북 가격 C
 */