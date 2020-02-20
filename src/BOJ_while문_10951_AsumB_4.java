import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_while문_10951_AsumB_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strBuffer;

        do{
            strBuffer = br.readLine().split(" ");

            System.out.println(Integer.parseInt(strBuffer[0]) + Integer.parseInt(strBuffer[1]));
        }while(br.ready());
    }
}
