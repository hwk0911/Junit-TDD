import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Reculsive_10870_피보나치수5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n == 0)
            System.out.println(0);
        else if(n == 1)
            System.out.println(1);
        else
            System.out.println(getAnswer(0,1,n,2));
    }

    public static int getAnswer (int f0, int f1, int number, int index) {
        if(index == number){
            return f0 + f1;
        }

        return getAnswer(f1, f0 + f1, number, index + 1);
    }
}
