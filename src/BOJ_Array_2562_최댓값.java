import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Array_2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxIndex = 0;
        int maxNumber = 0;
        int number = 0;

        for(int index = 1 ; index < 10 ; ++index){
            number = Integer.parseInt(br.readLine());
            if(maxNumber < number){
                maxIndex = index;
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
        System.out.println(maxIndex);
    }
}
