import java.io.*;

public class BOJ_14681_사분면고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x * y > 0) {
            if(x < 0) {
                bw.write("3");
            }
            else {
                bw.write("1");
            }
        }
        else {
            if(x < 0) {
                bw.write("2");
            }
            else {
                bw.write("4");
            }
        }

        bw.flush();
        bw.close();
    }
}
